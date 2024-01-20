package gcu.kea.terraform.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private int code;
    private String message;
    private Object data;
}
