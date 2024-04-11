package springboot.validator;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class MyValidation {
    @NotBlank
    private String name;
    @Min(0)
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
