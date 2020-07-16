package com.example.springboot.valid;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@Validated
public interface Login {
    void login(@NotNull String name, String password);
}
