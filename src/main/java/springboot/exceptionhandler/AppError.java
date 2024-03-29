package springboot.exceptionhandler;


public class AppError {
    private String message;
    private String reason;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getReason() {
        return reason;
    }
}
