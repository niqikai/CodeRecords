package com.example.springboot.aspect;

import com.example.springboot.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author niqikai
 */
@Slf4j
@Component
@Aspect
public class ControllerLog {
    @Pointcut("execution(public * com.example.springboot.controller..*.*(..))")
    public void controllers() {
    }


    @Before("controllers()")
    public void before(JoinPoint joinPoint) {
        HttpServletRequest request = (
                (ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())
        ).getRequest();
        Map<String, Object> headerMaps = new HashMap<>(16);
        for (Enumeration<String> enu = request.getHeaderNames(); enu.hasMoreElements(); ) {
            String name = enu.nextElement();
            headerMaps.put(name, request.getHeader(name));
        }

        log.info("请求IP:  {}", request.getRemoteAddr());
        log.info("请求路径: {}", request.getRequestURL());
        log.info("请求头:   {}", JacksonUtils.writeValueAsString(headerMaps));
        log.info("请求方式: {}", request.getMethod());
        log.info("方法描述: {}", joinPoint.getSignature());
        log.info("请求参数: {}", JacksonUtils.writeValueAsString(request.getParameterMap()));

    }
}
