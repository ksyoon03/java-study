package Challange._1;

public class Weapon extends Item {
    private int power;

    Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }

    @Override
    public void use(){
        System.out.println("[" + name + "]을(를) 장착했습니다! (공격력 +"  + power + ")");
    }
}
