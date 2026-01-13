package Jan_13.Interface.test;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int w, int height) {
        this.width = w;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
