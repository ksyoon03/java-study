package Challange._2;

public class Bicycle extends Vehicle{
    public Bicycle(String modelName) {
        super(modelName);
    }

    @Override
    public void move() {
        System.out.println("[" + modelName + "] 자전거 도로를 달립니다.");
    }
}
