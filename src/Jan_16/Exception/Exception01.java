package Jan_16.Exception;

public class Exception01 {
    public static void m1() throws MyCheckedException {
        System.out.println("m1 호출");
        m2();
    }

    // throws: 나를 호출한 쪽에게 예외처리를 전파하겠다.
    // throws 전파할 예외클래스
    public static void m2() throws MyCheckedException {
        System.out.println("m2 호출");

        // 의도적으로 예외를 생성할 수 있다. (throw)
        // throw new MyRuntimeException("m2에서 런타임 에러 발생");

        // 체크예외는 컴파일 전에 try - catch가 강제됨
        throw new MyCheckedException("m2에서 체크예외 발생");
    }

    public static void main(String[] args) {
        /*
            예외도 2가지 존재
            1. Checked Exception - 컴파일 시점에 검사가 강제되는 예외
            2. Unchecked Exception - 런타임 시점에 검사
         */

        // 호출 역순으로 예외객체가 이동하는 것 -> 예외 전파
        // m2에서 예외 발생! JVM은 코드 진행을 즉시 멈추고,
        // 해당 예외객체 타입을 받아주는 catch를 찾는다.
        // m2 catch x -> m1 catch x -> main catch x
        // -> 콘솔에 에러 출력
        try {
            m1();
        } catch (MyRuntimeException e){
            System.out.println("main에서 처리할게요 - runtime");
            System.out.println(e.getMessage());
        } catch (MyCheckedException e) {
            System.out.println("main에서 처리할게요 - checked");
            System.out.println(e.getMessage());
        }
    }
}
