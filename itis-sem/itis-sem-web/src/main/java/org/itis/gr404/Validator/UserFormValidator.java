package org.itis.gr404.validator;

import org.itis.gr404.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");

        User user = (User) obj;
        if(user.getAge() < 0){
            errors.rejectValue("age", "negativeValue", new Object[]{"'age'"}, "age can't be negative");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstname","firstname.empty", "Can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastname","lastname.empty", "Can't be empty!");
    }
}
