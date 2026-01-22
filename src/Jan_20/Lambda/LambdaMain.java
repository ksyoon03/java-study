package Jan_20.Lambda;

public class LambdaMain {
    public static int calcNum(int n1, int n2, Calculator calculator){
        return calculator.calculate(n1, n2);
    }

    public static void main(String[] args) {
        /*
            FP - Functional Programing
            메서드를 값(객체)처럼 다루고 싶다
            매개변수로 메서드를 넘기고 싶고,
            리턴으로 메서드를 리턴하고 싶음

            - 자바는 메서드만 단독으로 존재할 수 없음
            - 메서드가 객체가 되면 됨
            -> 메서드 하나만 가지는 객체를 만들면 됨

            // 필드값 필요x
            메서드를 값처럼 변수에 할당 -> 익명클래스
            -> 인터페이스에 메서드 하나 정의하고 쓰면 됨
         */

        // add는 익명클래스 객체 - 업캐스팅 되어있음
        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // multi의 실제 타입은 add와는 다른 타입
        Calculator multi = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        // 아직까지는 메서드를 매개변수로 넘기는 것 같지 않음
        // 목표: 메서드를 넘겨주는 것처럼 보여야 한다
        System.out.println(add.calculate(10, 5));
        System.out.println(multi.calculate(10,5));

        // (매개변수1, 매개변수2) -> { 구현부 };
        // 인터페이스에 정의된 메서드가 하나
        // -> 정의된 시그니처 1개
        Calculator lambdaAdd = (int num1, int num2) -> {
            return num1 + num2;
        };

        // 생략 가능한 모든걸 생략 가능
        // 매개변수 타입 특정됨 -> 생략
        // 한 줄 리턴 (화살표 다음에 중괄호{} 생략이 가능하면 return 생략)
        Calculator lambdaAdd2 = (n1, n2) -> n1 + n2;

        // 람다로 메서드를 정의한 익명객체()를 넘긴다
        calcNum(10, 5, lambdaAdd2);


        // 인라인으로 정의한다 (정석적인 방법은 이것)
        // cacNum 메서드는 Calculator 인터페이스 타입의 매개변수를 받음
        // 변수에 담는게 아니라 매개변수 자리에 인라인으로 정의 및 생성이 가능한 것
        calcNum(10, 5, (a, b)-> a * b);
    }
}
