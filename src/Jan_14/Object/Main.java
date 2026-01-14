package Jan_14.Object;

public class Main {
    public static void main(String[] args) {
        ObjectStudent st1 = new ObjectStudent("홍길동", 20);
        // printf(), println() -> 원시자료형은 문자열로 변환해서 출력
        // 객체들은 함수 내부에서 .toString() 결과를 출력
        System.out.println(st1.toString());
        System.out.println(st1);

        ObjectStudent st2 = new ObjectStudent("홍길동", 20);
        // == 연산자 -> stack값 비교
        // 참조 자료형은 stack에 heap 주소가 저장됨
        System.out.println(st1==st2); // false
        // = 연산자 -> stack값 복사
        ObjectStudent st3 = st1; // 얕은 복사
        System.out.println(st1 == st3); // true

        // equals()는 Obeject가 가지고 있는 메서드
        // Object에는 == 연산자 비교를 하고 있음
        System.out.println(st1.equals(st2));

    }
}
