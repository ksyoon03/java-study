package Jan_16.Exception;

// 커스텀 예외(비즈니스 예외)
public class InvalidEmailException extends RuntimeException {
    private String email;

    public InvalidEmailException(String message, String email) {
        super(message + email);
        this.email = email;
    }
}
