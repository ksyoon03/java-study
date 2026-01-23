package _15_Optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        /*
            값이 존재할 수도 있고, 존재하지 않을 수도 있는 상황
            -> null이 반환되는 경우
            값이 없을 수도 있음을 표현
         */

        // Optional 생성
        // 1. of(): 확실히 null이 아닐 때
        Optional<String> opt1 = Optional.of("데이터1");
        // 2. ofNullable(): null일 수도 있고 아닐 수도 있는
        Optional<String> optNull = Optional.ofNullable(null);

        // 존재여부 확인
        System.out.println(opt1.isPresent()); // 있으면 true
        System.out.println(opt1.isEmpty()); // 없으면 true

        // orElse - 즉시 실행
        String result1 = optNull.orElse("기본값1");
        // orElseGet - 지연 실행
        String result2 = optNull.orElseGet(() -> "기본값2");
        // ** orElseThrow - 값이 없으면 예외를 넣음 (제일 많이 씀) **
        try{
            String result3 = optNull.orElseThrow(() -> new RuntimeException("null입니다."));
        } catch (RuntimeException e){
            System.out.println("예외발생: " + e.getMessage());
        }

        // ifPresent() - 값이 있으면 실행
        opt1.ifPresent(str -> System.out.println("가지고 있는 값: " + str));
        optNull.ifPresent((str) -> System.out.println("출력 안됨"));

        // ifPresentOrElse(있을때, 없을때) - 값이 있을때, 없을때 동작을 각각 함수로 정의
        optNull.ifPresentOrElse(
                value -> System.out.println("값이 있을 때: " + value),
                () -> System.out.println("값이 없음")
        );


    }
}
