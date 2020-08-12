package com.example.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class BizException extends RuntimeException{
    private Code code;
    private String msg;

}
