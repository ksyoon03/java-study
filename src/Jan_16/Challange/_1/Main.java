package Jan_16.Challange._1;

public class Main {
    public static void main(String[] args) {
        String name = CoffeeMenu.AMERICANO.getName();
        int count = 3;
        int finalPrice = CoffeeMenu.AMERICANO.calculatePrice(count);

        System.out.println("주문 메뉴: " + name);
        System.out.println("주문 수량: " + count + " 잔");
        System.out.println("총 결제 금액: " + finalPrice + " 원");
    }
}
