package _14_Stream.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("김자바", "컴공", 92, "010-1111-1111", "java1@java.com"),
                new Student("박자바", "컴공", 88, "010-2222-2222", "java2@java.com"),
                new Student("최자바", "경영", 76, "010-3333-3333", "java3@java.com"),
                new Student("이자바", "경영", 79, "010-4444-4444", "java4@java.com"),
                new Student("정자바", "전자", 91, "010-5555-5555", "java5@java.com")
        );

        // List<Item> -> List<Integer>
        // List<Student> -> List<StudentDto>
        List<StudentDto> dtos = students.stream()
                .map((st) -> st.toDto())
                .toList();
        // 단점: 코드가 방대해진다
        // -> Student가 StudentDto로 변환되는 것을 Student가 책임 질 수 있지 않을까?

        System.out.println(dtos);


    }
}
