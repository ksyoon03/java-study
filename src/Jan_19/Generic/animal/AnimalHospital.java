package Jan_19.Generic.animal;

// 상한 경계 설정
// T extends A
// T는 A 타입이거나, A를 상속받은 타입이어야 한다.
// 최상위 부모 Object까지 업캐스팅 x
// A 타입까지만 업캐스팅 (컴파일러가 해줌)
public class AnimalHospital<T extends Animal> {
    private T animal;

    // 필드에 있는 animal은 T로 업캐스팅되어 Object가 되기 때문에
    // sound 메서드가 없음
    public void makeSound(){
        // 상한 경계로 인해 Animal 타입으로 업캐스팅되기 때문에
        // sound() 메서드가 있다는걸 보장할 수 있다.
        animal.sound();
    }

    public T getBiggerOne(T animal1, T animal2){
//        if(animal1.getSize() > animal2.getSize()){
//            return animal1;
//        } else {
//            return animal2;
//        }

        T bigger = animal1.getSize() > animal2.getSize() ? animal1 : animal2;
        return bigger;
    }
}
