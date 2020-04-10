package com.example.springboot.service.valid;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class Argue {
    @NotNull
    private String name;
    @NotNull
    @Positive
    private Integer age;
    @Valid
    @NotNull
    private InnerChild child;

    @Data
    public static class InnerChild {
        @NotNull
        private String name;
        @NotNull
        @Positive
        private Integer age;
    }

}
