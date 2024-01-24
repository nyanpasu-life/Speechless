package speechless.auth.application.dto;

import speechless.member.domain.Member;

public interface OAuthMemberResponse {
    String getEmail();

    String getNickName();

    String getPicture();

    Member toMember();
}
