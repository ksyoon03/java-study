package _2_Inheritance;

// 자식 클래스
// 상속 받는 방법 -> 클래스 이름 extends 상속 받을 클래스 명
public class ElectricCar extends Car{
    // private year -> 접근 불가
    // protected brand -> 필드를 상속 받아서 가지고 있음
    private int batteryLevel; // 전기차만의 필드

    // 자식의 기본 생성자
    // 자식의 생성자를 호출하면, 부모의 생성자가 가장 처음 호출됨
    // 부모의 필드를 먼저 초기화 -> 자식의 필드가 초기화됨
    public ElectricCar(){
        super(); // 부모의 생성자 호출
        // super()는 생략 가능 - 부모의 기본 생성자는 생략 가능

        System.out.println("전기차 생성자 호출!");
        this.batteryLevel = 100;
    }

    // 오버로딩
    public ElectricCar(String brand){
        // 제약사항: super() 호출은 생성자 호출 시 가장 먼저 실행 되어야함
        // 생성자 내에서 super() 코드 위에 다른 코드가 있으면 안됨
        super(brand); // brand만 초기화하는 부모 생성자 호출
        this.batteryLevel = 100;
    }

    // this.필드 != this()
    // super.필드 != super()
    // 필드 접근 != 생성자 접근
    // super.필드: heap 영역에서 부모 영역만 탐색
    // super.메서드(): 부모 클래스 기준에서 호출
    public void moveWithInfo(){
        super.move(); // 부모의 메서드에 접근
        // super.brand // 부모로부터 물려받은 필드 접근 가능
        // this. brand // super는 this에서 물려받은 부분을 가리킴
    }

    // 자식만 가지고 있는 필드를 사용하는 인스턴트 메서드
    public void charge(){
        System.out.println("배터리를 충전합니다.");
        this.batteryLevel = 100;
    }
}
