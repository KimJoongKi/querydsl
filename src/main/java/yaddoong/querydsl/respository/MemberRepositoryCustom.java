package yaddoong.querydsl.respository;

import yaddoong.querydsl.dto.MemberSearchCondition;
import yaddoong.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
}
