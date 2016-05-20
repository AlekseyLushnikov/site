package org.itis.gr404.validator;

import org.itis.gr404.entity.Order;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class OrderFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Order.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Order order = (Order) obj;
        if (order.getPrice() < 0) {
            errors.rejectValue("price", "price.min", "Can't be negative!");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"product","product.empty", "Can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userId","userId.empty", "Can't be empty!");
    }
}
