package Jan_13.Challange._3;

public class Main {
    public static void main(String[] args) {
        Americano americano1 = new Americano("아메리카노(S)", CafeConstants.SIZE_SMALL);
        Americano americano2 = new Americano("아메리카노(L)", CafeConstants.SIZE_LARGE);

        System.out.println("=== " + CafeConstants.CAFE_NAME + " ===");
        americano1.info();
        americano1.calculatePrice();

        americano2.info();
        americano2.calculatePrice();
    }
}
