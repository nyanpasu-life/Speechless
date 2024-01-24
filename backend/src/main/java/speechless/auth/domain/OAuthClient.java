package speechless.auth.domain;

import speechless.auth.application.dto.OAuthMemberResponse;

public interface OAuthClient {
    OAuthMemberResponse request(String authCode, String redirectUri);
}
