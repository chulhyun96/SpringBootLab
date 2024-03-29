package springboot.exceptionhandler;

public class SampleException extends RuntimeException {
    private final String message;
    public SampleException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
