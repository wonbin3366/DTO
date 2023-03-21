package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user;
    private Timestamp createdAt;
}
