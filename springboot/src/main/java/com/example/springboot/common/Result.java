package com.example.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = 3988577068420189419L;

    private Integer code;
    private String msg;
    private Long ts = System.currentTimeMillis();
    private Object data;

    public static Result ofSuccess() {
        return new Result()
                .setCode(0);
    }
    public static Result ofSuccess(Object data) {
        return new Result().setCode(0).setMsg("success").setData(data);
    }

    public static Result ofFail(Integer code, String msg) {
        return new Result().setCode(code).setMsg(msg);
    }

    public static Result ofFail(Integer code, String msg, Object data) {
        return new Result().setCode(code).setMsg(msg).setData(data);
    }

    public static Result ofFail(Code code) {
        return new Result().setCode(code.getCode()).setMsg(code.getMessage());
    }

    public static Result ofFail(BizException e) {
        return ofFail(Code.getByCode(e));
    }

}
