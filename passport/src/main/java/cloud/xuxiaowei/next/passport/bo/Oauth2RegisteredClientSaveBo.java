package cloud.xuxiaowei.next.passport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

import static cloud.xuxiaowei.next.utils.DateUtils.DEFAULT_DATE_TIME_FORMAT;

/**
 * 客户表 保存参数
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
public class Oauth2RegisteredClientSaveBo implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "clientId 不能为空")
    private String clientId;

    @JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
    private LocalDateTime clientIdIssuedAt;

    private String clientSecret;

    @JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
    private LocalDateTime clientSecretExpiresAt;

    /**
     * 用户识别码
     */
    @NotEmpty(message = "用户识别码 不能为空")
    private String code;

    @NotEmpty(message = "clientName 不能为空")
    private String clientName;

    @NotEmpty(message = "clientAuthenticationMethods 不能为空")
    private String clientAuthenticationMethods;

    private String authorizationGrantTypes;

    private String redirectUris;

    @NotEmpty(message = "scopes 不能为空")
    private String scopes;

    @NotEmpty(message = "clientSettings 不能为空")
    private String clientSettings;

    @NotEmpty(message = "tokenSettings 不能为空")
    private String tokenSettings;


}