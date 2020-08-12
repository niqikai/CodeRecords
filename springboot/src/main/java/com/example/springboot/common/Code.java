package com.example.springboot.common;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Code {

    SUCCESS(0, "success"),
    SERVER_ERROR(9999, "system error"),

    REQUEST_ERROR(400, "请求错误"),
    UNAUTHORIZED(401, "未授权"),
    NOT_ACCESSIBLE(403, "不可访问"),
    METHOD_NOT_ALLOWED(405, "方法不被允许"),
    UNSUPPORTED_MEDIA_TYPE(415, "不支持当前媒体类型"),


    TOKEN_LOSE_EFFICACY(1001,"您的登录令牌已失效，请重新登录"),
    ;

    private Integer code;

    private String message;

    Code(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void addMsg(String msg) {
         this.message = this.message + ": " + msg;
    }

    public static Code getByCode(Integer code) {
        for (Code errorCode : Code.values()) {
            if (errorCode.getCode().equals(code)) {
                return errorCode;
            }
        }
        return null;
    }


    public static Code getByCode(BizException e) {
        Code code = e.getCode();
        String msg = e.getMsg();
        code.addMsg(msg);
        return code;
    }
}
