package com.example.jdbcdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Status status;

    private Type type;

    public User(String name, Status status, Type type) {
        this.name = name;
        this.status = status;
        this.type = type;
    }

    public User(String name,  Type type) {
        this.name = name;

        this.type = type;
    }
}
