package _4_Interface.test;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * 3.14;
    }
}
