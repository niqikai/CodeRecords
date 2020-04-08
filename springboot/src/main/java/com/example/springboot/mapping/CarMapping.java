package com.example.springboot.mapping;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Type(TypeEnum.BLUE)
@Mapper(componentModel = "spring")
public interface CarMapping extends TestInterface{
    @Override
    default TypeEnum getType() {
        return TypeEnum.BLUE;
    }
    @Mapping(target = "name", source = "brand")
    CarDTO convert(Car car);
}
