package com.example.springboot;

import com.example.springboot.service.valid.Argue;
import com.example.springboot.service.valid.ValidService;
import com.github.javafaker.Faker;
import org.hibernate.validator.HibernateValidator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private Faker faker;

    @Autowired
    private ValidService validService;

    @Test
    void test() {
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.job().position());
        System.out.println(faker.name().fullName());
    }


    @Test
    void testValid() {
        validService.start(16, "jack");
        Argue person = new Argue();
//		person.setName("fsx");
//		Argue.InnerChild child = new Argue.InnerChild();
//		child.setName("fsx-son");
//		child.setAge(-1);
//		person.setChild(child); // 放进去

        validService.play(null);

//
//		Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(false)
//				.buildValidatorFactory().getValidator();
//		Set<ConstraintViolation<Argue>> result = validator.validate(person);
//
//		// 输出错误消息
//		result.stream().map(v -> v.getPropertyPath() + " " + v.getMessage() + ": " + v.getInvalidValue())
//				.forEach(System.out::println);

    }

}
