package com.mx.skeleton.domain.dto;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserDTO implements Serializable {

    private Long idUser;
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Boolean active;
    private Date createDate;

}
