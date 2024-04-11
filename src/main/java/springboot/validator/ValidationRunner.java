package springboot.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.Objects;

@Component
public class ValidationRunner implements ApplicationRunner {
    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MyValidation myValidation = new MyValidation();
        myValidation.setName("");
        myValidation.setAge(-1);
        Errors errors = new BeanPropertyBindingResult(myValidation, "myValidation");
        validator.validate(myValidation, errors);

        errors.getAllErrors().forEach(error -> {
            Arrays.stream(Objects.requireNonNull(error.getCodes())).forEach(System.out::println);
            System.out.println(error.getDefaultMessage());
        });
    }
}
