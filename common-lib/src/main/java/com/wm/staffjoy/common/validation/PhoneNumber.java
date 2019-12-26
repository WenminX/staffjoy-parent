package com.wm.staffjoy.common.validation;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * 手机号码校验
 *
 * @author  wm
 * @date  2019/12/26
 */
@Constraint(validatedBy = {PhoneNumberValidator.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface PhoneNumber {

    String message() default "Invalid phone number";

    Class[] group() default {};

    Class[] payload() default {};
}
