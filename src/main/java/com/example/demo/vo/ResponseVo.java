package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseVo<T> {
    private Integer code;
    private String message;
    private T data;
}
