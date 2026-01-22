package Challange._2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("소나타");
        vehicles[1] = new Bicycle("삼천리");
        for(Vehicle v : vehicles){
            v.move();
        }
    }
}
