package speechless.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import speechless.auth.infra.kakao.config.KaKaoCredentials;

@Configuration
@EnableConfigurationProperties({
        KaKaoCredentials.class,
        JwtCredentials.class,
}) public class Appconfig {
}