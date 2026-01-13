package Jan_13.Interface;

public class Main {
    public static void main(String[] args) {

        /*
         상속의 한계
         1. 자식 클래스로 갈수록, heap 영역이 방대해짐
         2. 다중상속이 불가능. 하나의 클래스는 하나의 부모 클래스만 가짐.
         상속은 is - a 관계. Mage is a Character

         인터페이스
         can - do 관계. Dog can Swim
         1. 필드 확장이 아니라, 오로지 기능 조립/조합 역할
         2. 다중이식이 가능!
        */

        // 인터페이스도 엄연히 타입이다
        Animal dog = new Dog(); // (사이드) 캐스팅
        Animal duck = new Duck(); // (사이드) 캐스팅

        Animal[] animals = {dog, duck};
        for(Animal animal : animals){
            animal.move(); // 다형성 구현
            if(animal instanceof Flayable){
                // 임시 캐스팅: 캐스팅했다가 다시 원상 복귀
                ((Flayable) animal).fly();
            }
            if(animal instanceof Swimable){
                // 임시 캐스팅
                ((Swimable) animal).swim();
            }

            AnimalManager manager = new AnimalManager();
            Dog dog2 = new Dog();
            Duck duck2 = new Duck();

            // 매개변수로 넘어갈 때 Animal 타입으로
            // 캐스팅되서 넘어간다고 생각해도 됨
            manager.makeSound(dog2);
            manager.makeSound(duck2);

            manager.makeSwim(dog2);
            manager.makeSwim(duck2);
        }

    }
}
