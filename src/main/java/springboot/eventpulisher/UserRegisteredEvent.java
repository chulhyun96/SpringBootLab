package springboot.eventpulisher;

public class UserRegisteredEvent {
    private String userName;
    private Object source;

    public UserRegisteredEvent(Object source, String userName) {
        this.userName = userName;
        this.source = source;
    }

    public String getUserName() {
        return userName;
    }
}
