package _14_Stream;

import java.util.*;

public class OperationMain {
    public static void main(String[] args) {
        // 반복문 + 함수 + 리스트에 add()
        // 중간연산 - filter, map, distinct, limit

        // 정렬 -> 정렬 알고리즘 - 다양함
        // 4. sorted() - 정렬
        // 함수형 인터페이스 Comparator<T>를 매개변수로 받는다.
        // compare(T o1, T o2)

        List<Integer> numbers = Arrays.asList(1,3,5,4,2,10,9);
        List<Integer> sortedNums1 = numbers.stream()
                // 정렬은 알고리즘마다 방법이 다 다르다
                // 어떤 정렬 알고리즘이던지 결국 2개를 대소비교하게 된다.
                // comparator로 추상화한 것
                .sorted((n1, n2) -> n1 - n2) // 오름차순
                .toList();
        // 정렬의 결과는 우리가 작성한 람다 함수의 리턴값에 따라 달라진다
        // 실제값과는 무관하다

        // 오름차순일 때
        // n1 = n2 -> 리턴값이 0을 리턴하게 구현
        // n1 > n2 -> 리턴값이 양수가 되게 구현
        // n1 < n2 -> 리턴값이 음수가 되게 구현
        System.out.println(sortedNums1);

        // 내림차순일 때
        // n1 = n2 -> 리턴값이 0을 리턴하게 구현
        // n1 > n2 -> 리턴값이 음수가 되게 구현
        // n1 < n2 -> 리턴값이 양수가 되게 구현
        List<Integer> sortedNums2 = numbers.stream()
                .sorted((n1, n2) -> (n1 - n2) * -1) // 내림차순
                .toList();
        System.out.println(sortedNums2);

        List<String> names = Arrays.asList("김자바", "이파이썬", "박스프링", "김자사", "정리액트");

        // 문자정렬
        // 기본: 사전순 정렬 (예: abc, abd, bce)
        // 문자는 숫자로 변환 가능
        // - 사전에서 뒤에 출현하는 문자가 더 큰 숫자로 변환

        // s1.compareTo(s2) -> s1 - s2 : 사전순 정렬 (오름차순)
        List<String> sortedNames1 = names.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .toList();

        // s2.compareTo(s1) -> (s1 - s2) * -1 : 사전역순 정렬 (내림차순)
        List<String> sortedNames2 = names.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList();

        System.out.println(sortedNames1);
        System.out.println(sortedNames2);

        List<Item> items = Arrays.asList(
                new Item("노트북", 1400000),
                new Item("마우스", 45000),
                new Item("키보드", 70000),
                new Item("헤드셋", 100000)
        );

        // price를 기준으로 오름차순 정렬
        List<Item> sortedItems = items.stream()
                .sorted((it1, it2) -> it1.getPrice() - it2.getPrice())
                .toList(); // 자바17 이후 버전
                //.collect(Collectors.toList()); // 낮은 버전

        System.out.println(sortedItems);

        // 최종값으로 boolean을 리턴하는 최종연산자
        // 조건을 만족하는 결과를 boolean을 리턴
        List<String> names2 = Arrays.asList("김자바", "이파이썬", "박스프링", "김자사", "정리액트");

        // anyMatch(Predicate<T> p) - 람다 리턴값이 하나라도 true이면 true
        boolean hasKim = names2.stream()
                .anyMatch(name -> name.startsWith("김"));
        System.out.println(hasKim);

        // allMatch(Predicate<T> p) - 람다 리턴값이 모두 true여야만 true
        boolean isAllKim = names2.stream()
                .allMatch(name -> name.startsWith("김"));
        System.out.println(isAllKim);

        // max(), min() - Comparator 타입을 매개변수로 받음
        // -> 최대, 최소가 없을 수도 있음.
        // Optional 자료형 리턴
        // Optional -> null 때문에 일어나는 에러를 방지하기 위해
        // 한 번 감싼 wrapper 타입
        String longestName = names2.stream()
                .max((n1, n2) -> n1.length() - n2.length())
                .orElse("없음");

        Item highestPriceItem = items.stream()
                .max((i1, i2) -> i1.getPrice() - i2.getPrice())
                .orElseThrow(() -> new RuntimeException("아이템이 없습니다"));


    }
}
