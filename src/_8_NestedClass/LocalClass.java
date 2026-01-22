package _8_NestedClass;

public class LocalClass {
    // 지역클래스
    /*
        - 메서드 내부에서 정의되는 클래스
        - 해당 메서드 내부에서만 객체 생성 가능

        - 지역클래스는 외부클래스의 private 필드에도 접근가능
    */
    private int a;
    private int b;

    // 인스턴스 메서드
    public void printTotal(int num1, int num2) {

        class Calculator {
            int add(int x, int y) {
                System.out.println(a); // 바깥클래스의 private 필드접근
                System.out.println(b);
                return x + y;
            }
        }

        // 지역클래스는 메서드 내부에서만 사용가능
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("계산결과: " + result);

    }

    // 이제는 잘 사용하지 않는다.
    // 메서드 안에서 메서드를 정의해서 쓰고 싶다.
    // 람다 이후로는 사실상 안쓰이게 됨.

}
