package Jan_16.Enum;

public class Main {
    // 할인율 차등적용한 가격을 리턴하는 메서드
    public static double discount(int price, ClassGrade grade){
        int discountRate = 0;
        // == 연산자 사용 가능 (주소 비교도 가능함!)
        if(grade == ClassGrade.BASIC) {
            // 매직넘버 예방이 가능하다
            discountRate = ClassGrade.BASIC.getDiscountRate();
        } else if (grade == ClassGrade.GOLD){
            discountRate = ClassGrade.GOLD.getDiscountRate();
        } else if (grade == ClassGrade.DIAMOND) {
            discountRate = ClassGrade.DIAMOND.getDiscountRate();
        } else {
            System.out.println("할인 없음!");
        }

        double finalPrice = price * discountRate / 100.0;
        return finalPrice;
    }

    public static void main(String[] args) {
        int price =  10000;
        // 회원 등급을 가져오는 코드

        // 객체를 상수처럼 쓰면서, 컴파일 시점에 에러(타입검증)을 볼 수 있다.
        // 문법적으로 상수 사용을 강제하는 시스템을 만들 수 있다.
        double result = discount(price, ClassGrade.BASIC);

        double diamondResult = Grade.DIAMOND.getDiscountPrice(price);

        // enum은 Enum 클래스 상속 -> Enum 클래스에 정의된 메서드 사용o
        // 1. String -> enum의 상수 이름
        Grade goldConstatntObj = Grade.valueOf("GOLD");
        System.out.println(goldConstatntObj == Grade.GOLD);
        System.out.println(goldConstatntObj.getDiscountRate());

        // 2. enum의 상수 이름 -> String
        String goldName = Grade.GOLD.name();
        System.out.println(goldName.equals("GOLD"));
    }
}
