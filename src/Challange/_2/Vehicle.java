package Challange._2;

abstract public class Vehicle {
    String modelName;
    int speed;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        speed = 0;
    }

    public int accelerate(int amount){
        speed += amount;
        return speed;
    }

    abstract public void move();
}
