package com.union.sivillage.member.application;

import com.union.sivillage.member.domain.Member;
import com.union.sivillage.member.dto.MemberSignUpDto;
import com.union.sivillage.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public void signUp(MemberSignUpDto memberSignUpDto) {
        Member member = memberSignUpDto.toEntity();
        // todo : memberSignUpDto 를 Member로 변환하여 저장

    }

    @Override
    public Member getMemberById(Long id){
        Optional<Member> member = memberRepository.findById(id);
        return null;
    }

    @Override
    public Member getMemberByEmail(String email) {
        Optional<Member> member = memberRepository.findByEmail(email);
        return null;

    }


}
