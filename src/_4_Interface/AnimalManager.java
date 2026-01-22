package _4_Interface;

public class AnimalManager {

    // 의존성 / 결합도
    // Dog 클래스는 AnimalManager를 의존하는가? -> no
    // Dog Animal 의존 중
    // AnimalManager -> Animal 의존 중
    // 의존성 방향 [Dog] -> [Animal] <- {AnimalManager]
    // -> 구체적인 클래스끼리 의존하는게 아니라, 인터페이스를 통해 작동
    // -> 결합도가 낮은 구조 (수정과 추가에 유연하고 안정적임)


    // SOLID에서 D
    // DIP - 의존성 역전의 원칙


    // makeSound는 Animal 인터페이스에 의존
    // 추상체(인터페이스, 추상 클래스)를 의존하는 것과
    // 구현체(구체적인 클래스)를 의존하는 것은 다르다
    public void makeSound(Animal animal){
        animal.sound();
    }

    public void makeFly(Flayable flyable){
        flyable.fly();
    }

    public void makeSwim(Swimable swimable){
        swimable.swim();
    }

}
