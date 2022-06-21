package cloud.xuxiaowei.next.passport.configuration;

import cloud.xuxiaowei.next.core.properties.JwkKeyProperties;
import cloud.xuxiaowei.next.utils.Constant;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.core.OAuth2TokenType;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.authorization.JdbcOAuth2AuthorizationConsentService;
import org.springframework.security.oauth2.server.authorization.JdbcOAuth2AuthorizationService;
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsentService;
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationService;
import org.springframework.security.oauth2.server.authorization.client.JdbcRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.config.ProviderSettings;
import org.springframework.security.oauth2.server.authorization.token.JwtEncodingContext;
import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenCustomizer;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import java.util.stream.Collectors;

import static org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl.DEF_GROUP_AUTHORITIES_BY_USERNAME_QUERY;

/**
 * 授权服务器配置
 *
 * @author xuxiaowei
 * @see <a href="http://127.0.0.1:1301/.well-known/oauth-authorization-server">OAuth 2.0 授权服务器元数据请求的默认端点URI</a>
 * @see <a href="http://127.0.0.1:1301/oauth2/authorize?client_id=xuxiaowei_client_id&redirect_uri=http://127.0.0.1:1401/code&response_type=code&scope=snsapi_base&state=beff3dfc-bad8-40db-b25f-e5459e3d6ad7">/oauth2/authorize</a>
 * @see <a href="https://docs.spring.io/spring-security/reference/6.0.0-M3/servlet/oauth2/resource-server/jwt.html#oauth2resourceserver-jwt-authorization-extraction">手动提取权限-6.0.0-M3</a>
 * @see <a href="https://github.com/spring-projects/spring-authorization-server/issues/181#issuecomment-756913042">将用户权限作为声明传播`Jwt`是一种自定义行为</a>
 * @see <a href="https://github.com/spring-projects/spring-authorization-server/blob/a30a1692b28915947a001f1e2a6d1e41a550eaa7/oauth2-authorization-server/src/test/java/org/springframework/security/config/annotation/web/configurers/oauth2/server/authorization/OidcTests.java#L264">自定义 Jwt 声明和标头官方示例代码</a>
 * @see <a href="https://github.com/spring-projects/spring-authorization-server/issues/199">自定义 Jwt 声明和标头需要更灵活 议题</a>
 * @since 0.0.1
 */
@Slf4j
@Configuration
public class AuthorizationServerConfiguration {

    private JwkKeyProperties jwkKeyProperties;

    @Autowired
    public void setJwkKeyProperties(JwkKeyProperties jwkKeyProperties) {
        this.jwkKeyProperties = jwkKeyProperties;
    }

    /**
     * @see <a href="https://docs.spring.io/spring-authorization-server/docs/current/reference/html/protocol-endpoints.html">协议端点的</a> Spring Security 过滤器链。
     * @see WebSecurityConfigurerAdapterConfiguration#securityFilterChain(HttpSecurity) 优先级要比此方法低
     */
    @Bean
    @Order(-1)
    public SecurityFilterChain authorizationServerSecurityFilterChain(HttpSecurity http) throws Exception {

        OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);

        return http.build();
    }

    /**
     * @see <a href="https://docs.spring.io/spring-security/reference/servlet/authentication/index.html">用于身份验证</a> 的 Spring Security 过滤器链。
     */
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        // 表单登录处理从授权服务器过滤器链到登录页面的重定向
        http.authorizeHttpRequests((authorize) -> {
            authorize
                    // 端点放行
                    .antMatchers("/" + Constant.ACTUATOR + "/**").permitAll()
                    // 放行检查Token
                    .antMatchers("/oauth2/check_token").permitAll()
                    // 其他路径均需要授权
                    .anyRequest().authenticated();
        });

        http.oauth2ResourceServer().jwt(oauth2ResourceServer -> {
            RSAPublicKey rsaPublicKey = jwkKeyProperties.rsaPublicKey();
            NimbusJwtDecoder.PublicKeyJwtDecoderBuilder publicKeyJwtDecoderBuilder = NimbusJwtDecoder.withPublicKey(rsaPublicKey);
            NimbusJwtDecoder nimbusJwtDecoder = publicKeyJwtDecoderBuilder.build();
            oauth2ResourceServer.decoder(nimbusJwtDecoder);
        });

        return http.build();
    }

    /**
     * @see UserDetailsService 用于检索用户进行身份验证的实例。
     */
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager(dataSource);

        // 启用权限组
        userDetailsService.setGroupAuthoritiesByUsernameQuery(DEF_GROUP_AUTHORITIES_BY_USERNAME_QUERY.replace(" groups ", " `groups` "));
        userDetailsService.setEnableGroups(true);

        return userDetailsService;
    }

    /**
     * @see RegisteredClientRepository 用于管理客户端的实例。
     */
    @Bean
    public RegisteredClientRepository registeredClientRepository(JdbcTemplate jdbcTemplate) {
        return new JdbcRegisteredClientRepository(jdbcTemplate);
    }

    /**
     * 授权码、授权Token、刷新Token 持久化
     */
    @Bean
    public OAuth2AuthorizationService oauth2AuthorizationService(JdbcOperations jdbcOperations, RegisteredClientRepository registeredClientRepository) {
        return new JdbcOAuth2AuthorizationService(jdbcOperations, registeredClientRepository);
    }

    /**
     * 授权 持久化
     */
    @Bean
    public OAuth2AuthorizationConsentService oauth2AuthorizationConsentService(JdbcOperations jdbcOperations, RegisteredClientRepository registeredClientRepository) {
        return new JdbcOAuth2AuthorizationConsentService(jdbcOperations, registeredClientRepository);
    }

    /**
     * @see JWKSource 用于签署访问令牌的实例。
     */
    @Bean
    public JWKSource<SecurityContext> jwkSource() {
        RSAKey rsaKey = new RSAKey.Builder(jwkKeyProperties.rsaPublicKey()).privateKey(jwkKeyProperties.privateKey()).build();
        JWKSet jwkSet = new JWKSet(rsaKey);
        return new ImmutableJWKSet<>(jwkSet);
    }

    /**
     * JWK 增加用户权限
     *
     * @see <a href="https://github.com/spring-projects/spring-authorization-server/issues/181#issuecomment-756913042">将用户权限作为声明传播`Jwt`是一种自定义行为</a>
     * @see <a href="https://github.com/spring-projects/spring-authorization-server/blob/a30a1692b28915947a001f1e2a6d1e41a550eaa7/oauth2-authorization-server/src/test/java/org/springframework/security/config/annotation/web/configurers/oauth2/server/authorization/OidcTests.java#L264">自定义 Jwt 声明和标头官方示例代码</a>
     * @see <a href="https://github.com/spring-projects/spring-authorization-server/issues/199">自定义 Jwt 声明和标头需要更灵活 议题</a>
     */
    @Bean
    public OAuth2TokenCustomizer<JwtEncodingContext> jwtCustomizer() {
        return context -> {
            if (OAuth2TokenType.ACCESS_TOKEN.equals(context.getTokenType())) {
                Authentication principal = context.getPrincipal();

                // 用户权限
                Set<String> authorities = principal.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());

                // 客户权限
                Set<String> authorizedScopes = context.getAuthorizedScopes();

                // 合并权限
                authorities.addAll(authorizedScopes);

                context.getClaims().claim(Constant.AUTHORITIES, authorities);
            }
        };
    }

    /**
     * {@link ProviderSettings} 配置 Spring Authorization Server 的实例。
     */
    @Bean
    public ProviderSettings providerSettings() {
        return ProviderSettings.builder().build();
    }

}