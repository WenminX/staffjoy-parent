package com.wm.staffjoy.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * This is Description
 *
 * @author wm
 * @date 2019/12/26
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        // can bu true
        if (phoneNumber == null) {
            return true;
        }
        return phoneNumber.matches("[0-9]+") && (phoneNumber.length() > 8)
                && (phoneNumber.length() < 14);
    }
}
