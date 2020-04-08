package com.example.springboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author niqikai
 */
public class JacksonUtils {
    public static String writeValueAsString(Object o) {
        String ret = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            ret = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
