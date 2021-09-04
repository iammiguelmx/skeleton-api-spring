package com.mx.skeleton.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class PasswordForgotDto {

    @Email @NotEmpty @Getter @Setter
    private String email;

}