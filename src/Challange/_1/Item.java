package Challange._1;

public class Item {
    protected String name;
    protected int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void use(){
        System.out.println("아이템을 사용했습니다.");
    }
}
