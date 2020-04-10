package com.example.springboot.service.valid.impl;

import com.example.springboot.service.valid.Argue;
import com.example.springboot.service.valid.ValidService;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Service
public class ValidServiceImpl implements ValidService {
    @Override
    public void start(@NotNull @Min(10) Integer id, @NotNull String name) {
        System.err.println("id = "+id + "name = " +name);
    }

    @Override
    public void play(@Valid @NotNull Argue argue) {
        System.out.println(argue);
    }


}
