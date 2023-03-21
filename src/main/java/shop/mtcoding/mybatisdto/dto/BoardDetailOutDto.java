package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class BoardDetailOutDto {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;

    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}
