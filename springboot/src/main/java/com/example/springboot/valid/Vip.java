package com.example.springboot.valid;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Vip {
    @NotBlank
    private String name;
    @NotNull
    private Integer age;
}
