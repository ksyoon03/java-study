package Jan_15.Challange._1;

public class Main {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void run() {
                System.out.println("익명 클래스로 동작 수행!");
            }
        };
        action.run();
    }
}
