package Jan_13.Challange._1;

public class Bicycle extends Vehicle{
    public Bicycle(String modelName) {
        super(modelName);
    }

    @Override
    public void move() {
        System.out.println("[" + modelName + "] 자전거 도로를 달립니다.");
    }
}
