package Jan_13.Interface;

public class Duck implements Animal, Swimable, Flayable{

    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

    @Override
    public void swim() {
        System.out.println("참방참방");
    }
}
