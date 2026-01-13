package Jan_13.Challange._3;

abstract public class Drink {
    String name;
    int size;

    public Drink(String name, int size) {
        this.name = name;
        this.size = size;
    }

    abstract void calculatePrice();

    void info(){
        System.out.println(CafeConstants.CAFE_NAME + "의 " + name +" 음료입니다.");
    }
}
