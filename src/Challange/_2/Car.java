package Challange._2;

public class Car extends Vehicle{
    public Car(String modelName) {
        super(modelName);
    }

    @Override
    public void move() {
        System.out.println("[" + modelName + "] 도로를 달립니다.");
    }
}
