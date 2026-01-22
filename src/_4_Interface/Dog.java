package _4_Interface;

// 기능만 명세했던 인터페이스를 각 클래스에 장착해줌
// extends가 아닌 implements를 사용
// 인터페이스는 다중이식이 가능함
public class Dog implements Animal, Swimable{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("깡총깡총");
    }

    @Override
    public void swim() {
        System.out.println("어푸어푸");
    }
}
