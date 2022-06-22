package cloud.xuxiaowei.next.passport;

import cn.hutool.crypto.asymmetric.RSA;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import reactor.core.publisher.Mono;

import java.security.interfaces.RSAPublicKey;

/**
 * 响应式 Nimbus Jwt 解码器 测试类
 *
 * @author xuxiaowei
 * @see 0.0.1
 */
@Slf4j
class NimbusReactiveJwtDecoderTests {

	@Test
	void decode() throws JsonProcessingException {
		RSA rsa = new RSA(null,
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvUEZbnpoYCSVveN8/h3ouADkX1l5/qpS/vaVuWMOMpVbWqiVysrL7x8NV0i0NKBf+Ufa0aJBMYtsRGTsKOGv4ulwoUCMDizZ47xCUVMR6JCbm3qVejeK5GWPatrRFPWXwIL5G4nk4ZkpEhFUn0qeJwEPG70QNxZDNJVIqbDK0CROZifd/7REy9SQjIsQbVjUmC2J09IXE4FK3YDIltUOJLf7ASnkIb5al/IelKLIkoYaiI4Jjw6/zK2QXwNaO74FSOIbxDM/yixrkuArtsrqLbxjw/BMlW5pLguTfbeXobbmS+t1MgIfCmWye5GXCsuuS+K/RElLmvBtT+o1xZNBowIDAQAB");

		NimbusReactiveJwtDecoder nimbusReactiveJwtDecoder = new NimbusReactiveJwtDecoder(
				(RSAPublicKey) rsa.getPublicKey());

		Mono<Jwt> decode = nimbusReactiveJwtDecoder.decode(
				"eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ4dXhpYW93ZWkiLCJhdWQiOiJ4dXhpYW93ZWlfY2xpZW50X2lkIiwibmJmIjoxNjU1OTA1NjM0LCJzY29wZSI6WyJzbnNhcGlfYmFzZSJdLCJpc3MiOiJodHRwOlwvXC9ERVNLVE9QLURHUUwyRlQ6MTQwMSIsImV4cCI6MTY1NTk0ODgzNCwiaWF0IjoxNjU1OTA1NjM0LCJhdXRob3JpdGllcyI6WyJtYW5hZ2VfdXNlcl9kZWxldGUiLCJ1c2VyX29hdXRoMl91c2VyQXV0aGVudGljYXRpb24iLCJhYWFhYWFhIiwidXNlcl9kZXRhaWxzIiwiYXVkaXRfYWNjZXNzVG9rZW5fcmVhZCIsImF1ZGl0X2F1dGhvcml6YXRpb25fY29uc2VudF9yZWFkIiwibWFuYWdlX3VzZXJfYWRkIiwibWFuYWdlX3VzZXJfcmVhZCIsInVzZXJfaW5mbyIsIm1hbmFnZV9jbGllbnRfYWRkIiwiYXVkaXRfcmVmcmVzaFRva2VuX2RlbGV0ZSIsInNuc2FwaV9iYXNlIiwibWFuYWdlX2NsaWVudF9lZGl0IiwiYXVkaXRfY29kZV9kZWxldGUiLCJ1c2VyX29hdXRoMl9vYXV0aDJSZXF1ZXN0IiwiYXVkaXRfYXV0aG9yaXphdGlvbl9kZWxldGUiLCJhdWRpdF9hdXRob3JpemF0aW9uX2NvbnNlbnRfZGVsZXRlIiwiYXVkaXRfYWNjZXNzVG9rZW5fZGVsZXRlIiwidXNlcm5hbWVfdG9rZW5fZGVsZXRlIiwiY2xpZW50SWRfdG9rZW5fZGVsZXRlIiwiYXVkaXRfcmVmcmVzaFRva2VuX3JlYWQiLCJtYW5hZ2VfdXNlcl9hdXRob3JpdHkiLCJhdWRpdF9hdXRob3JpemF0aW9uX3JlYWQiLCJtYW5hZ2VfY2xpZW50X2RlbGV0ZSIsIm1hbmFnZV9jbGllbnRfcmVhZCIsImF1ZGl0X2NvZGVfcmVhZCIsInVzZXJfYXV0aG9yaXRpZXMiLCJtYW5hZ2VfdXNlcl9lZGl0Il19.HtkmN28tEPmgeKfJXGIbiIDgfPqRtfm23lkHSR1hBfRdeePTdnE_-YGZte1KxupXg-Fi_HoQIIqVmCf_MM5QOURsC6MDuwMin4SzKin71xLwGFLdBvbwCtr20nDIPfLzYdVk5ezxggeTf3amu75MgKpZfew_OOkY4bKrqoiKOaVxcD-wWJltURORinLfp0etAx__cthfNIg18g4Zq7Z9Wx1tBi8w-V_vcuQ1_j5zpqbG0PKt8yIc3ivKRzux7okGu6gybGucvrfhAQWdCkOh2wMDQuC9QF_WP09LIWv-pfrpFGeoZNIgGqZKkUCLuZ8AY02gNnMvekvq03vW1auDiQ");

		Jwt jwt = decode.block();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
		String json = objectWriter.writeValueAsString(jwt);
		log.info("\n" + json);
	}

}
