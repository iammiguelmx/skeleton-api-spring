package com.mx.skeleton.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton.domain
 * @ClassName:
 * @Author:
 * @Description:
 * @Date:
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name="user_generator", sequenceName = "user_seq")
    @Column(name="user_id", updatable = false, nullable = false)
    private Long user_id;

    @NotNull
    @Getter @Setter
    @Column(name = "name", nullable = false)
    private String name;

    @Getter @Setter
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Getter @Setter
    @Column(name = "user_name",  unique = true)
    private String userName;

    @Getter @Setter
    @Length(min = 4, message = "*Your password must have at least 4 characters")
    @NotEmpty(message = "*Please provide your password")
    @Column(name = "password")
    private String password;

    @Getter @Setter
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Getter @Setter
    @Column(name = "active")
    private Boolean active;

    @Getter @Setter
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createDate;

}
