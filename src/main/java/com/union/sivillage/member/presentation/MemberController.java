package com.union.sivillage.member.presentation;

import com.union.sivillage.member.application.MemberService;
import com.union.sivillage.member.dto.MemberSignUpDto;
import com.union.sivillage.member.vo.MemberRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/sign-up")
    public void signUp(@RequestBody MemberRequestVo memberRequestVo){
//        MemberSignUpDto memberSignUpDto = MemberSignUpDto.builder()
//                        .email(memberRequestVo.getEmail())

        ModelMapper modelMapper = new ModelMapper();
        MemberSignUpDto memberSignUpDto = modelMapper.map(memberRequestVo, MemberSignUpDto.class);
        memberService.signUp(memberSignUpDto);
    }

    @GetMapping("")
    public void getMemberById(@PathVariable Long id){
        memberService.getMemberById(id);
    }




}
