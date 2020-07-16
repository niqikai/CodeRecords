package org.example;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println("name: " + name.orElse("empty,hello"));
    }
}
