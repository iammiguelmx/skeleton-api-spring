package com.mx.skeleton.model;

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
@Table(name = "tbitacora")
public class BitacorraError implements Serializable {

    private static final long serialVersionUID = 5858816075945385536L;

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bitacoraerror_generator")
    @SequenceGenerator(name="bitacoraerror_generator", sequenceName = "tbitacora_seq")
    @Column(name="id", updatable = false, nullable = false)
    private Long bitacora_id;

    @Column(name = "tipo_error", updatable = false, nullable = false)
    private String tipoError;

    @Column(name = "proceso", updatable = false, nullable = false)
    private String proceso;

    @Column(name ="error_detail", updatable = false, nullable = false)
    private String errorDetail;

    @Column(name = "create_date", nullable = false, updatable = false)
    private Date createDate;

}
