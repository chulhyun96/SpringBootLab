package springboot.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class MyValidationValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return MyValidation.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty","name is not supposed to be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "NotEmpty","age is not supposed to be 0");

    }
}
