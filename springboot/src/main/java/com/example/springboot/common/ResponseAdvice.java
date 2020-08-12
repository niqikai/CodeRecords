package com.example.springboot.common;

import com.example.springboot.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {


    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof Result) {
            return body;
        }
        return Result.ofSuccess(body);
    }



    @ExceptionHandler(value = {Exception.class})
    public Result nullPointerExceptionHandler(HttpServletRequest request, NullPointerException e) {
        log.error("异常,url:{}, e: {}",request.getRequestURL(), e);
        return Result.ofFail(Code.SERVER_ERROR);
    }

    //
    @ExceptionHandler(value = {BizException.class})
    public Result bizExceptionHandler(HttpServletRequest request, BizException e) {
        log.error("业务异常,url:{}, e: {}",request.getRequestURL(), e);
        return Result.ofFail(e);
    }
}
