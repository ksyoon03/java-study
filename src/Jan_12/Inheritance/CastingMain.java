package Jan_12.Inheritance;

public class CastingMain {
    public static void main(String[] args){
        // 캐스팅 - 타입을 변경하는 것
        // 상속관계에서의 캐스팅
        // 1. 업캐스팅: 자식 클래스 객체 -> 부모 클래스 타입으로 변경
        // 2. 다운캐스팅: 부모 클래스 객체 -> 자식 클래스 타입으로 변경

        // 컴파일러와 JVM을 구분해서 생각해야함
        // 객체 초기화에서 or "=" 기준으로
        // 좌변은 컴파일러 영역, 우변은 JVM이 인식하는 영역
        // 컴파일러는 변수 타입만 고려해서 코드를 확인
        // JVM은 실제 메모리에 올라간 것만 고려해서 작동

        ElectricCar eCar1 = new ElectricCar();
        eCar1.charge(); // 전기차만의 메서드
        Car car1 = (Car) eCar1; // 업캐스팅 (자식객체 -> 부모타입)
        // car1.charge(); // 업캐스팅이 되어서, Ecar의 메서드는 더 이상 호출할 수 없음

        Car car2 = new GasCar(); // 생성은 자식객체, 타입은 부모객체 - 업캐스팅
        // 컴파일러는 변수 타입만 고려했기 때문에 아래의 코드를 허용
        // 하지만 JVM이 해당 코드를 실행할 때 에러가 발생
        // 컴파일러 에러 = 컴파일 에러
        // JVM 에러 = 런타임 에러
        // ElectricCar eCar2 = (ElectricCar) car2;
        // eCar2.charge();

        // instanceof 연산자
        // car2는 ElectricCar의 객체(인스턴스) 입니까?
        // instanceof 기준으로 왼쪽 개체가 오른쪽 타입 정보를 갖고 있는가?
        System.out.println(car2 instanceof ElectricCar);
        // car2는 GasCar의 객체(인스턴스) 입니까?
        System.out.println(car2 instanceof GasCar);
        // car2는 Car의 객체(인스턴스) 입니까?
        System.out.println(car2 instanceof Car); // this는 super를 포함한다

        // 안전한 다운캐스팅
        // 조건문 + instanceof 연산자를 통해 런타임 오류를 피할 수 있다
        if (car2 instanceof ElectricCar) {
            ElectricCar eCar3 = (ElectricCar) car2;
            eCar3.charge();
        } else if (car2 instanceof GasCar){
            GasCar gCar2 = (GasCar) car2;
            // 안전하게 다운캐스팅 가능
        }
    }
}
