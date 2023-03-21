package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
