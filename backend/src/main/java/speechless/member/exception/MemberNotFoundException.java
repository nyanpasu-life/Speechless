package speechless.member.exception;

import speechless.common.error.ErrorCode;
import speechless.common.error.SpeechlessException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class MemberNotFoundException extends SpeechlessException {
    public MemberNotFoundException() {
        super(new ErrorCode(NOT_FOUND, "회원을 찾을 수 없습니다!"));
    }
}
