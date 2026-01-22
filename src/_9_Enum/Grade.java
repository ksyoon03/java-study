package _9_Enum;

// enum: 정체는 Enum이라는 클래스를 상속받은 클래스
// 많은 코드 부분들이 생략 가능
// 사용 예시) 회원등급, 문제유형, 예외생성기(enum과 Exception)
public enum Grade {
    // public static final Grade BASIC = new Grade(5);
    BASIC(5),
    // public static final Grade GOLD = new Grade(10);
    GOLD(10),
    // public static final Grade DIAMOND = new Grade(20);
    DIAMOND(20);
    // 상단에 상수 객체들을 선언

    private int discountRate;

    // public 지정 불가능
    // private 생략 가능
    Grade(int discountRate){
        this.discountRate = discountRate;
    }

    // 클래스로부터 만들어진 enum이기 때문에 인스턴스 메서드 정의 가능
    public int getDiscountRate(){
        return discountRate;
    }

    public double getDiscountPrice(int price){
        double finalPrice = price * discountRate / 100.0;
        return finalPrice;
    }
}
