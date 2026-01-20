package Jan_20.Collections;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        // Array ->  유틸클래스: Arrays
        // Collection -> 유틸클래스: Collections

        // 정렬
        Integer[] nums = {1, 10 ,6, 11, 3};
        List<Integer> numbers = Arrays.asList(nums);
        // 원본을 조작, 오름차순
        Collections.sort(numbers);
        System.out.println(numbers);
        // 원본을 조작, 내림차순
        Collections.reverse(numbers);
        System.out.println(numbers);

        // 최대, 최소
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        System.out.println(max + ", " + min);

        // addAll() - 여러 요소를 한 번에 추가
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        Collections.addAll(names, "김길동", "최길동");
        System.out.println(names);

        // 불변 컬렉션 - 한 번 데이터가 들어오면 변경이 안된다.
        // Arrays.asList(배열) - ArrayList가 아님
        // 크기 고정(add x), 삭제x(remove x)
        // 조회 가능(get o), 예외적으로 수정(set)은 가능

        // 불변(List.of or Map.of) - 조회만 가능
        List<String> myList = List.of("홍길동", "김길동");
        Map<String, Integer> students
                = Map.of(
                        "홍길동", 90,
                        "김길동", 80,
                        "최길동", 70
        );

        // myList.add("최길동"); // 불변에 추가 불가능
        myList = List.of("홍길동", "김길동", "최길동"); // 갈아끼워 줘야됨
    }
}
