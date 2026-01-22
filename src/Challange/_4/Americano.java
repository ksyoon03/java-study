package Challange._4;

public class Americano extends Drink{
    int price = 3000;

    public Americano(String name, int size) {
        super(name, size);
    }

    @Override
    void calculatePrice() {
        int finalPrice = price;
        if(size == CafeConstants.SIZE_LARGE){
            finalPrice += 500;
        }
        System.out.println("가격: " + finalPrice);
    }
}
