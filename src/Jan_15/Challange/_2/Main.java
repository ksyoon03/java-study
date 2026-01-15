package Jan_15.Challange._2;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop
                .builder()
                .getModel("MacBook")
                .getPrice(200)
                .build();
        System.out.println("노트북 모델: " + laptop.getModel() + ", 가격: " + laptop.getPrice());
    }
}
