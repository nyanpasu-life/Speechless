package speechless.auth.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import speechless.auth.application.AuthService;
import speechless.auth.application.dto.OAuthMemberResponse;
import speechless.auth.domain.OAuthClient;
import speechless.auth.dto.TokenDto;

@Service
@RequiredArgsConstructor
public class AuthServiceFacade {
    private final AuthService authService;
    private final OAuthClient oAuthClient;

    public TokenDto login(String authCode, String redirectUri) {
        OAuthMemberResponse oAuthMemberResponse = oAuthClient.request(authCode, redirectUri);
        return authService.login(oAuthMemberResponse);
    }

    public String renewAccessTokenBy(String refreshToken){
        return authService.renewAccessTokenBy(refreshToken);
    }

    public void logout(Long memberId){
        authService.logout(memberId);
    }
}
