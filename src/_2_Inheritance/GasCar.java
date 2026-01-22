package _2_Inheritance;

public class GasCar extends Car {
    private int fuelLevel;

    // 기본 생성자
    public GasCar(){
        // super() - 생략 되어있음
        System.out.println("GasCar 기본 생성자 호출");
        this.fuelLevel = 100;
    }

    public GasCar(String brand){
        // super(brand); -> 생략하면 super()(기본 생성자)가 자동으로 삽입됨
        super(brand);
        this.fuelLevel = 100;
    }

    // @Override를 작성하면, 컴파일러가 부모의 시그니처를 탐색해서 비교함
    // 메서드가 동일하게 있는지 탐색하고, 없으면 컴파일 에러가 발생함
    @Override // @ 어노테이션
    public void move(){
        System.out.println("가솔린 차가 이동합니다");
    }

}
