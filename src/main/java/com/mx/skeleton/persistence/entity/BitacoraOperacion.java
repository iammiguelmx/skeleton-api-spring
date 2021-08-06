package com.mx.skeleton.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
@Table(name = "tbitacoraoperacion")
public class BitacoraOperacion implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bitacoraioperation_generator")
    @SequenceGenerator(name="bitacoraioperation_generator", sequenceName = "tbitacoraop_seq")
    @Column(name="id", updatable = false, nullable = false)
    private Long bitacora_id;

    @Column(name = "proceso", updatable = false, nullable = false)
    private String proceso;

    @Column(name ="user", updatable = false, nullable = false)
    private String username;

    @Column(name = "date", nullable = false, updatable = false)
    private Date date;

}
