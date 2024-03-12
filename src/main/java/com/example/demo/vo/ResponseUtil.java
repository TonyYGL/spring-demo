package com.example.demo.vo;

public class ResponseUtil<T> {

    public static <T> ResponseVo<T> getSuccess(T data) {
        return new ResponseVo<>(200, "success", data);
    }
}
