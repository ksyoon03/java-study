package _13_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain2 {
    // 함수형 인터페이스를 매개변수로 받는 메서드도 이미 정의되어 있음
    // -> stream API
    public static void test(Function f, String name){
        System.out.println(f.apply(name));
    }

    public static void main(String[] args) {
        // "표준" 함수형 인터페이스 (함수명은 몰라도됨 -> 인터페이스명은 "꼭!" 알아야함
        /*
            1. Function<T, R>: T타입 매개변수를 받아서 R타입을 리턴함
            - R apply(T t)
            2. Consumer<T>: T타입 매개변수, 리턴 x
            - void accept(T t)
            3. Supplier<T>: 매개변수 x, T타입 리턴
            - T get()
            4. Predicate<T>: T타입 매개변수, boolean 리턴
            - boolean test(T t)
         */
        Function<String, String> addNim = name -> name + "님";
        System.out.println(addNim.apply("이순신"));

        Consumer<String> printer = log -> System.out.println(log);
        printer.accept("람다로 만든 로그입니다.");

        // 매개변수가 하나일 때만 소괄호() 생략 가능
        // 매개변수가 없을 때는 소괄호() 생략 불가능 -> 그냥 빈 소괄호 쓰면 됨
        Supplier<RuntimeException> myError = () -> new RuntimeException("내가 만든 에러");
        // throw myError.get();

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test((10)));

        test(name -> name + "고객님","홍길동");
    }
}
