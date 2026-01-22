package _2_Inheritance;

public class Main {
     public static void main(String[] args){
         // 부모의 기본 생성자가 먼저 호출되고, 자식의 기본 생성자가 호출됨
         ElectricCar eCar = new ElectricCar();

         eCar.move(); // Car(부모)의 메서드
         eCar.openDoor(); // Car의 메서드
         eCar.moveWithInfo(); // super.move()를 내부적으로 호출
         eCar.charge(); // 전기차(자식)만의 메서드

         // 오버라이드?
         GasCar gCar = new GasCar("현대");
         gCar.openDoor(); // Car의 메서드
         // 부모와 동일한 메서드(메서드 시그니처가 동일)를 정의하면
         // 메서드 시그니처: 메서드 이름, 매개변수 개수, 매개변수 순서, 반환 타입
         // 부모의 메서드는 무시된다 -> 자식의 메서드로 덮어쓰기가 되버림
         gCar.move(); // Car의 메서드가 아닌 GasCar 메서드가 호출

         // 자식 객체가 메서드를 호출하면, 자식 클래스 정보에 메서드가 있는지 확인
         // -> 없으면 부모 클래스로 찾아가서 탐색한다.
         // -> 있으면 자식 클래스의 메서드를 호출한다.

         // Override를 강제하면 -> 특정 클래스를 상속받은 클래스의 객체들은
         // 오버라이드된 메서드를 반드시 가지고 있게 된다
         // -> 호출이 보장된다
     }
}
