package _2_Inheritance;

// 부모클래스 - 기초 설계도 (공통 부분)
// 모든 차가 가져야할 공통적인 필드, 기능(메서드)들이 정의됨
// 공통 필드, 공통 메서드를 추려내는 작업 -> 추상화
public class Car {
    private int year; // 생산 연도
    // protected: 상속받는 클래스만 접근 가능
    protected String brand; // 브랜드명

    // 기본 생성자
    public Car(){
        System.out.println("기본 생성자 호출");
        this.brand = "기본차";
    }

    // 전체 초기화 생성자
    public Car(int year, String brand){
        this.year = year;
        this.brand = brand;
    }

    // 상속되는 필드(protected) 초기화 생성자
    public Car(String brand) {
        System.out.println("부모 생성자 호출");
        this.brand = brand;
    }

    // 공통 기능들
    public void move() {
        System.out.println("기본 차가 이동합니다");
    }

    public void openDoor(){
        System.out.println("기본 차가 문을 엽니다.");
    }
}
