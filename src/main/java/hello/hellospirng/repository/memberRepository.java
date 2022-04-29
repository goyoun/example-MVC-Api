package hello.hellospirng.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospirng.domain.Member;

/**
 * memberRepository
 */
public interface memberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

    // 알트 쉬프트 O
}