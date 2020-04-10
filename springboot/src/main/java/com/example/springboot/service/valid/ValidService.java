package com.example.springboot.service.valid;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ValidService {

    /**
     * test valid
     * @param id id
     * @param name name
     */
    void start(@NotNull @Min(10) Integer id, @NotNull String name);

    /**
     * play
     * @param argue a
     */
    void play(@Valid  @NotNull Argue argue);
}
