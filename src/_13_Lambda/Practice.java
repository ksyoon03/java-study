package _13_Lambda;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        List<String> customerNames
                = List.of("홍길동", "김길동", "박길동", "최길동",
                "이순신", "을지문덕", "쏘니", "페이커", "쵸비");

        // 람다로 customerNames에 담긴 이름들 + "님"을 붙이는 코드
        // 매개변수가 하나면 (매개변수) -> 매개변수 소괄호 생략 가능
        List<String> nims = new ArrayList<>();
        StringProcessor makeNim = s -> s + " 님";
        for(String name : customerNames){
            nims.add(makeNim.process(name));
        }
        System.out.println(nims);

        // 이름이 3글자 미만인 이름들만 따로 저장
        List<String> under3Names = new ArrayList<>();
        StringChecker is3Names = s -> s.length() < 3;
        for(String name : customerNames){
            if(is3Names.check(name)){
                under3Names.add(name);
            }
        }
        System.out.println(under3Names);

        List<String> inputs = List.of(
                "hello", "", "world!", "", "java", ""
        );

        // StringCheck를 이용해서 빈 문자열이면 true,
        // 빈 문자열이 아니면 false 로직을 담은 람다식
        StringChecker isBlankStr = s -> s.isBlank();

        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김자바", 22),
                new Person("이파이썬", 30),
                new Person("박스프링", 15)
        );

        // 람다로 20세 이상 객체 찾는 코드
        PersonChecker adultChecker = p -> p.getAge() >= 20;
        List<Person> adults = new ArrayList<>();
        for(Person p : people){
            if(adultChecker.check(p)){
                adults.add(p);
            }
        }
        System.out.println(adults);

        // PersonChecker를 이용한 람다식으로
        // people에서 이름이 3글자 초과인 사람들만 뽑아서
        // results에 담기
        PersonChecker over3Names = p -> p.getName().length() > 3;
        List<Person> results = new ArrayList<>();
        for(Person p : people){
            if(over3Names.check(p)){
                results.add(p);
            }
        }
        System.out.println(results);

        List<Person> result2 = new ArrayList<>();
        // 이름의 두번째 글자를 *로 바꿔주는 코드
        Modifier<Person> makeMasking = p -> {
            String name = p.getName();
            String maskedName = name.charAt(0) + "*" + name.substring(2);
            // 1. setter 사용
            // 2. 새로운 Person 객체를 만들어 리턴 - 좀 더 일반적
            return new Person(maskedName, p.getAge());
        };

        List<Person> maskingPeople = new ArrayList<>();
        for(Person p : people){
            Person maskedPerson = makeMasking.modify(p);
            maskingPeople.add(maskedPerson);
        }

        // Modifier를 이용한 람다식으로
        // people에서 미성년자(age < 20) 이름을 "비공개"로 바꾸기
        Modifier<Person> setJunior = p -> {
            if(p.getAge() < 20){
                return new Person("비공개", p.getAge());
            }

            return new Person(p.getName(), p.getAge());
        };

        List<Person> juniors = new ArrayList<>();
        for(Person p : people){
            Person secretJuniors = setJunior.modify(p);
            juniors.add(secretJuniors);
        }
        System.out.println(juniors);
    }
}
