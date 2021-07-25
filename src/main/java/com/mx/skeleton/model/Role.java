package com.mx.skeleton.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rol")
public class Role  implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_generator")
    @SequenceGenerator(name="role_generator", sequenceName = "role_seq")
    @Column(name = "role_id")
    private Long id;

    @NotNull
    @Column(name = "role")
    private String role;

}
