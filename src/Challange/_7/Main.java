package Challange._7;

public class Main {
    public static void main(String[] args) {
        UserCounter user1 = UserCounter.getInstance();
        user1.visit();
        System.out.println("현재 접속자 수: " + user1.getCount());

        UserCounter user2 = UserCounter.getInstance();
        user2.visit();
        System.out.println("현재 접속자 수: " + user2.getCount());

        System.out.println("user1과 user2는 동일한 객체인가요? -> " + (user1 == user2));
    }
}
