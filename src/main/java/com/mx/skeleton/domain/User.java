package com.mx.skeleton.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

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
    @Column(name="id", updatable = false, nullable = false)
    private Long user_id;

    @NotNull
    @Getter @Setter
    @Column(name = "name", nullable = false)
    private String name;

    @Getter @Setter
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createDate;

}
