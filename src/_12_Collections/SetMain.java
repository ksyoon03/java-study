package _12_Collections;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {

        // Set의 특징
        // 중복허용 x - Map의 key는 Set으로 구현되어있는 것
        // 순서 보장 x, 집합연산을 지원한다.
        Set<String> fruits = new HashSet<>();

        // 추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple"); // 중복

        System.out.println(fruits);

        // 길이 - size()
        System.out.println(fruits.size());

        // 포함하는지 확인 가능
        // Hash 함수를 사용하기 때문에 조회(탐색)가 빠르다
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.contains("melon"));

        // 제거 - remove()
        fruits.remove("apple");
        System.out.println(fruits);

        // 집합연산
        Set<String> names1 = new HashSet<>();
        Set<String> names2 = new HashSet<>();

        names1.add("홍길동");
        names1.add("박길동");
        names1.add("고길동");

        names2.add("홍길동");
        names2.add("최길동");
        names2.add("한길동");

        // 합집합
        Set<String> union = new HashSet<>(names1); // names1의 데이터 복사
        union.addAll(names2); // names2의 모든 요소를 names1에 add()
        System.out.println(union);

        // 교집합
        Set<String> intersection = new HashSet<>(names1);
        intersection.retainAll(names2); // 중복값만 남김
        System.out.println(intersection);

        // 차집합
        Set<String> difference = new HashSet<>(names1);
        difference.removeAll(names2); // names2의 데이터들을 names1에서 각각 remove()
        System.out.println(difference);

        // 문자열.split():
        // 특정 문자열 기준으로 문자열을 분리해서 배열로 리턴
        String str1 = "my name is Son";
        String[] myStrings = str1.split(" ");
        System.out.println(Arrays.toString(myStrings));

        String text = "java is good java is powerful";
        String[] words = text.split(" ");

        // for문 사용
        Set<String> uniques = new HashSet<>();
        for(String word : words){
            uniques.add(word);
        }

        // 컬렉션 자료형끼리는 서로 형변환이 쉽다
        // 배열 -> 리스트
        List<String> fromArray = Arrays.asList(words);
        Set<String> uniques2 = new HashSet<>(fromArray);
        System.out.println(uniques2);


    }
}
