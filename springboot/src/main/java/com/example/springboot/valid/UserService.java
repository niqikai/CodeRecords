package com.example.springboot.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Service
@Validated
public class UserService implements Login{

    @Override
    public void login( String name, String password) {

        System.out.println();
        System.out.println("hello");
    }


    public void login2(@NotNull String name, String password) {

        System.out.println();
        System.out.println("hello");
    }



    public void vip( @Valid @NotNull Vip vip) {
        System.out.println(vip);
    }
}
