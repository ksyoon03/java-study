package _12_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        // 1. todo 갯수 입력 받기
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();
        System.out.print("할 일 입력 갯수: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // 2. 반복문으로 count 입력받기
        for(int i = 0; i<count; i++){
            System.out.print("할 일 입력: ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        // 3. for 문으로 전체 출력
        for(String todos : todoList){
            System.out.println("할 일: " + todos);
        }

//        todoList.forEach((todo ->
//                System.out.println(todo)
//        ));

        // 4. todo 검색어를 targetTodo 변수로 입력받기
        System.out.print("todo 검색어 입력: ");
        String targetTodo = scanner.nextLine();

        // 5. 해당 targetTodo를 리스트에서 삭제
        if(todoList.contains(targetTodo)){
            todoList.remove(targetTodo);
            System.out.println(targetTodo + " 삭제 완료");
        } else {
            System.out.println(targetTodo + " 검색어가 존재하지 않습니다.");
        }
    }
}
