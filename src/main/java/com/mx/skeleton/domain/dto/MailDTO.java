package com.mx.skeleton.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


@ToString
@NoArgsConstructor
public class MailDTO implements Serializable {

    private static final long serialVersionUID = -8174581587647900376L;

    @NotEmpty(message = "*Please provide your from")
    private String from;

    @NotEmpty(message = "*Please provide your mailTo")
    private String mailTo;

    @NotEmpty(message = "*Please provide your subject")
    private String subject;

    private List<Object> attachments;

    private Map<String, Object> props;

}