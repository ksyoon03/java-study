package _7_Wrapper;

public class Main {
    public static void main(String[] args) {
        /*
            원시자료형의 한계 -> 객체가 될 수 없음
            1. 메서드를 가질 수 없음
            2. null 값을 가질 수 없음
            int[] scores = {80, 90, 30, 50, 0}
            scores[4]의 값이 0인데, 초기화가 안된건지? 실제 0인건지?
            -> 초기화 안된걸 null로 통일하고 싶음
         */

        // int를 감싸는 래핑클래스
        // 원시자료형을 래퍼클래스로 대입 -> 박싱
        Integer integer1 = Integer.valueOf(90);
        Integer integer2 = 90; // 컴파일러가 알아서 해줌 (오토박싱)

        // char 감싸는 래퍼클래스
        Character c = 'A';

        // Integer, Character를 제외하면
        // 앞글자가 대문자인게 해당 원시자료형의 래핑클래스
        Boolean boolean1 = true; // 오토박싱
        Long long1 = 10L; // 오토박싱

        // 객체 -> 메서드 사용, 모든 클래스는 Object 상속
        // 값이 메모리 주소에 저장됨
        // == 연산자 사용 x -> equals()를 사용
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

        // -128 ~ 127를 필드로 가진 Integer 객체는
        // 캐싱이 되어있음. (미리 만들어져있는 객체를 제공함)
        Integer test1 = 100;
        Integer test2 = 100;
        System.out.println(test1 == test2); // 같은 객체를 사용 -> true

        // 래퍼클래스 -> 원시자료형: 언박싱
        // 래퍼객체: .intValue(), longValue()
        int int1 = test1.intValue();
        int int2 = test2.intValue();
        System.out.println(int1 == int2); // true

        // 미리 정의되어 있는 유틸메서드
        int max = Integer.max(10, 20);
        int min = Integer.min(10, 20);

        // max 메서드를 활용한 최대,최소 구하기
        Integer[] scores = {90, 80, 70, 60};
        Integer maxScore = scores[0];
        Integer minScore = scores[0];
        for(int i=1; i< scores.length; i++){
            maxScore = Integer.max(maxScore, scores[i]);
            minScore = Integer.min(maxScore, scores[i]);
        }
        System.out.println("최대: " + maxScore + ", 최소: " + minScore);

        // 문자열을 숫자로 변환
        // parseInt -> int 원시자료형으로 리턴
        int parse = Integer.parseInt("256");
        // valueOf -> Integer 래퍼객체로 리턴
        Integer parse2 = Integer.valueOf("512");

        // 비교메서드
        Integer number = 50;
        // number - 60 = 음수 -> -1 리턴
        int result1 = number.compareTo(60);
        System.out.println(result1);

        // nubmer - 40 = 양수 -> +1 리턴
        int result2 = number.compareTo(40);
        System.out.println(result2);

        // number - 50 = 0 -> 0 리턴
        int result3 = number.compareTo(50);
        System.out.println(result3);
    }
}
