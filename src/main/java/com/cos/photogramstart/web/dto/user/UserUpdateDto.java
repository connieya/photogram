package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserUpdateDto {
    @NotBlank
    private String nickname;
    @NotBlank
    private String password;
    private String website;
    private String bio;
    private String phone;
    private String gender;

    public User toEntity(){
        return User.builder()
                .nickname(nickname)
                .password(password)
                .website(website)
                .bio(bio)
                .phone(phone)
                .gender(gender)
                .build();
    }
}