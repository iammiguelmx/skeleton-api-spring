package com.mx.skeleton.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reset_password")
public class PasswordResetToken implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rpass_generator")
    @SequenceGenerator(name="rpass_generator", sequenceName = "rpass_seq")
    @Column(name = "id_pass")
    private Long id;

    @Getter @Setter
    @Column(nullable = false, unique = true)
    private String token;

    @Getter @Setter
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @Column(nullable = false)
    private Date expiryDate;

}
