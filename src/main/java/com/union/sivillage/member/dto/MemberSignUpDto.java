package com.union.sivillage.member.dto;

import com.union.sivillage.member.domain.Member;
import com.union.sivillage.member.vo.MemberRequestVo;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberSignUpDto {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String nickname;
    private Date birth;
    private String address;
    private String gender;

    public Member toEntity(){
        return Member.builder()
                //.id(id)
                .email(email)
                .password(password)
                .name(name)
                .phone(phoneNumber)
                .nickname(nickname)
                .birth(birth)
                .address(address)
                .build();
    }

    public static MemberSignUpDto toDto(MemberRequestVo memberRequestVo){
        return MemberSignUpDto.builder()
    }


}
