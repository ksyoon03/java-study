package Jan_12.Challange;

public class Potion extends Item {
    private int healAmount;

    Potion(String name, int price, int healAmount){
        super(name, price);
        this.healAmount = healAmount;
    }

    @Override
    public void use(){
        System.out.println("[" + name + "]을(를) 마셨습니다.");
    }

    public void heal(){
        System.out.println("체력이 [" + healAmount +"]만큼 회복됩니다!");
    }
}
