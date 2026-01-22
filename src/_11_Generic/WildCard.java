package _11_Generic;

public class WildCard {
    // 와일드 카드 문법 <?>
    // 사용하는 측에서 구체적인 타입이 아니라 <?>를 사용하는 방법

    // 와일드카드 Box<String>, Box<Integer> 등 모든 타입을 매개변수로 받겠다
    // Box<T>와 뭐가 다른가?
    // -> Box<T>: 객체를 생성할 때 유동적으로 타입 지정
    // -> Box<?>: 이미 생성되어있는 제너릭 Box들을 모두 대응하겠다
    public static void printAnyBox(Box<?> box){
        System.out.println(box.getItem()); // 읽기는 가능
        // box.setItem("문자열"); // 쓰기가 불가능

        // 오브젝트 취급됨
        Object mydata = box.getItem();

        // 서버응답 -> Response Body에 응답할 때
    }
}
