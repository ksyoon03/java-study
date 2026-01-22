package _10_Exception;

// 일반적으로 커스텀 예외는 RuntimeException을 상속받아 정의
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}
