package speechless.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import speechless.member.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);

    default Member getById(Long memberId){
        return findById(memberId).orElseThrow();
    }
}
