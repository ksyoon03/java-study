package Jan_13.Interface.test;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 2);
        Shape s3 = new Triangle(5, 10);

        double total = 0;
        Shape[] shapes = {s1, s2, s3};
        for (Shape s : shapes){
            // 다형성
            // 컴파일러는 Shape 타입에 getArea()가 있는지 검사
            // JVM은 new로 생성된 실제 객체의 getArea() 호출
            total += s.getArea();
        }
        System.out.println(total);
    }
}
