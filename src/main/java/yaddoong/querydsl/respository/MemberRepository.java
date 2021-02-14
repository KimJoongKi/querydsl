package yaddoong.querydsl.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import yaddoong.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);
}
