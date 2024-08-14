package com.union.sivillage.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    @Comment("회원이름")
    private String name;
    @Comment("회원 닉네임")
    @Column(nullable = false, length = 100)
    private String nickname;
    @Column(nullable = false, length = 20)
    private Date birth;
    @Column(nullable = false, length = 20)
    private String phone;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 100)
    private String password;
    @Column(nullable = false, length = 100)
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Builder
    public Member(String name,
                  String nickname,
                  Date birth,
                  String phone,
                  String email,
                  String password,
                  String address,
                  Gender gender) {
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.gender = gender;
    }


}
