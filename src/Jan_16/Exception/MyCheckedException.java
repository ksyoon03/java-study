package Jan_16.Exception;

// 커스텀 체크예외를 정의하는 방법
// Exception을 상속 받아준다.
public class MyCheckedException extends Exception {

    // 생성자
    public MyCheckedException(String message) {
        super(message);
    }
}
