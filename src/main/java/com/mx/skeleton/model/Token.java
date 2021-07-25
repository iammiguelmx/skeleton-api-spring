package com.mx.skeleton.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "token")
public class Token implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_VERIFIED = "VERIFIED";

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "token_generator")
    @SequenceGenerator(name="token_generator", sequenceName = "token_seq")
    @Column(name="id", updatable = false, nullable = false)
    private Long token_id;

    private String token;

    private String status;

    private LocalDateTime expiredDateTime;

    private LocalDateTime issuedDateTime;

    private LocalDateTime confirmedDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
