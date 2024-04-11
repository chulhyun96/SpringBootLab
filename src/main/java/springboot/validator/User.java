package springboot.validator;

import jakarta.validation.constraints.Pattern;

public class User {

    @Pattern(regexp = "^[a-zA-Z]*$",message = "UserID must contain only alphabets")
    private String userId;

    public User(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
