package com.union.sivillage.member.application;

import com.union.sivillage.member.domain.Member;
import com.union.sivillage.member.dto.MemberSignUpDto;

public interface MemberService {

    void signUp(MemberSignUpDto memberSignUpDto);
    Member getMemberById(Long id);
    Member getMemberByEmail(String email);

}
