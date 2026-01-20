package Jan_20.Collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        // Map - 추상체 / HashMap - 구현체
        // Map<Key의 자료형, Value의 자료형>
        // Array, ArrayList - 데이터를 인덱스로 관리
        // Map - 데이터를 Key로 관리
        // Key로 관리하다보니 ArrayList에 비해 상대적으로 무겁다
        Map<String, Integer> studentMap = new HashMap<>();
        // 제네릭 타입은 런타임 때 Object가 됨
        // -> 원시자료형은 제네릭 타입으로 선언 불가능

        // 추가 - put()
        studentMap.put("김자바", 90);
        studentMap.put("이파이썬", 85);
        studentMap.put("박스프링", 92);

        System.out.println(studentMap);
        /*
            {
                "김자바": 90,
                "이파이썬": 85,
                "박스프링": 92,
            }
            -> JSON(웹에서 데이터를 주고받는 형식)과 닮아 있음
         */

        // 조회 - get(key) : key가 관리하는 value를 리턴한다
        System.out.println(studentMap.get("김자바"));

        // key 중복은 불가능
        // 중복이 된다면 나중에 들어오는 key-value가 기존값을 덮어씀
        studentMap.put("김자바", 80);
        System.out.println(studentMap.get("김자바"));

        // 만약에 key로 객체를 쓰는 경우 어떻게 중복을 판단할 것인가?
        // 두 객체의 hashcode(), equals()의 결과가 모두 동일하면, 중복 객체다
        Map<ObjectStudent, Integer> myMap = new HashMap<>();
        ObjectStudent st1 = new ObjectStudent("홍길동", 20);
        ObjectStudent st2 = new ObjectStudent("홍길동", 20);
        myMap.put(st1, 90);
        myMap.put(st2, 80);
        // hashcode, equals의 구현에 따라 중복 여부가 갈린다
        System.out.println(myMap);

        // 크기 - size()
        System.out.println(studentMap.size());

        // 제거 - remove(key)
        System.out.println(studentMap);
        studentMap.remove("박스프링");
        System.out.println(studentMap);
        //없는 key를 remove 해도 아무 일도 일어나지 않는다
        studentMap.remove("아무거나");
        System.out.println(studentMap.get("박스프링"));

        // Map을 for문으로 순회하는 방법
        // 1. key들만 따로 추출해서 순회하는 방법
        Set<String> names = studentMap.keySet();
        for(String name: names){
            Integer score = studentMap.get(name);
            System.out.println(name + ": " + score);
        }

        // 번외. List 안에 Map들을 저장하는 구조
        List<Map<String, Integer>> school = new ArrayList<>();
        /*
            List 안에 선언된 Map의 구조
            [
                {
                    "이름": "홍길동",
                    "나이": 20
                },
                {
                    "학번": 20260002,
                    "나이": 23
                },
            ]
         */

        // 2. key-value 쌍을 한 번에 Set으로 바꿔서 순회 (성능적으로 더 좋은 방법)
        // 구조: { {}, {}, {}, ... {} }
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + ": " + score);
        }

        // 두 방법 모두 데이터가 적을 때 (만 개 이하)는 비슷
        // 방법1) keySet() + .get() -> 해시 탐색을 여러번
        // 방법2) entrySet() -> 해시탐색 1회로 key, value 모두 접근
        // 수만개 데이터 기준으로 20~30%의 성능 차이가 남



    }
}
