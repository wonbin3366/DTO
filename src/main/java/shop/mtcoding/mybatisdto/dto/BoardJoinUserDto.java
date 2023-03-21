package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
}
