package Jan_16.Exception;

public class HandleException {
    // 자바의 예외란?
    public static void main(String[] args) {
        /*
            오류 - Error, Exception
            Error - 자바환경에서 통제할 수 없는 에러
            Exception - 자바 개발자가 처리 가능한 오류
            비정상적인 상황들을 클래스로 미리 정의해 놓았음 -> 예외
         */

        int a = 10;
        int b = 1;
        // int result = a / b;

        // 사전에 정의되어있던 예외상황이 되면
        // 자동으로 예외 객체가 생성됨
        // JVM은 객체를 감지하고, 코드 진행을 즉시 멈춤
        // System.out.println("실행중입니다!");

        // 예외 상황이 일어날 것을 미리 알고, 처리할 수 있음
        try{
            // 예외가 일어날 가능성이 있는 코드
            int result = a / b;
            // JVM이 예외 객체를 들고 해당 타입 예외를 잡아줄
            // catch를 찾으러감 -> 있으면 catch의 매개변수에 넣어줌
            System.out.println("try 실행 중");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
        } finally {
            // 예외가 발생하건, 안하건 항상 실행되는 구문
            // 자원반납 - scanner.close(), JDBC에서 커넥션 반납
            System.out.println("finally 실행 중");
        }


    }
}
