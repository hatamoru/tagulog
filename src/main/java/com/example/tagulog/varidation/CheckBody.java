package com.example.tagulog.varidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target({FIELD, PARAMETER})
@Constraint(validatedBy = {CheckValidator.class})
public @interface CheckBody {
    String message() default  "hogehoge~";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
