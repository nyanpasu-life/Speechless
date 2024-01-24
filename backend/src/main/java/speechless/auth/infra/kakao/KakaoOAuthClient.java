package speechless.auth.infra.kakao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import speechless.auth.application.dto.OAuthMemberResponse;
import speechless.auth.domain.OAuthClient;
import speechless.auth.domain.OAuthMemberInfoClient;
import speechless.auth.domain.OAuthTokenClient;

@Component
@RequiredArgsConstructor
public class KakaoOAuthClient implements OAuthClient {

    private final OAuthTokenClient kakaoOAuthTokenClient;
    private final OAuthMemberInfoClient kakaoOAuthMemberInfoClient;

    @Override
    public OAuthMemberResponse request(String authCode, String redirectUri) {
        String accessToken = kakaoOAuthTokenClient.getAccessToken(authCode, redirectUri);
        return kakaoOAuthMemberInfoClient.getMember(accessToken);
    }
}
