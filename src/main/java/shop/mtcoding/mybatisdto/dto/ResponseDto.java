package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseDto<T> {
    private String msg;
    private T data;
}
