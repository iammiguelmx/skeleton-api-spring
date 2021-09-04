package com.mx.skeleton.persistence.mapper;

import com.mx.skeleton.domain.dto.UserDTO;
import com.mx.skeleton.persistence.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "user_id", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    User toUserDTO(UserDTO userDTO);


}
