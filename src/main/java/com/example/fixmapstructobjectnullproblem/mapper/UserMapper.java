package com.example.fixmapstructobjectnullproblem.mapper;

import com.example.fixmapstructobjectnullproblem.dto.UserDto;
import com.example.fixmapstructobjectnullproblem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}
