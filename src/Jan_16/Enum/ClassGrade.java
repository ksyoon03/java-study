package Jan_16.Enum;

public class ClassGrade {
    // Enum? 상수 업그레이드 버전
    /*
        상수의 문제점
        1. 컴파일 시점에 타입 검증이 불가능하다. (상수를 썼는지, 타입만 같은 다른 변수를 썼는지)
        2. 네임스페이스: 같은 이름의 상수들을 구분하기 어렵다.

        -> 문자열, 숫자 대신에 객체를 상수처럼 쓰면 안될까?
     */

    private int discountRate; // 할인율

    public static final ClassGrade BASIC = new ClassGrade(5);
    public static final ClassGrade GOLD = new ClassGrade(10);
    public static final ClassGrade DIAMOND = new ClassGrade(20);


    // 외부 호출 막음
    private ClassGrade(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public static void printDiscountRate(ClassGrade grade){
        int discountRate = grade.getDiscountRate();
        System.out.println(discountRate);
    }

    public static void main(String[] args) {
        // 상수'만' 사용 가능
        printDiscountRate(ClassGrade.BASIC);
        printDiscountRate(ClassGrade.GOLD);
        printDiscountRate(ClassGrade.DIAMOND);
    }
}
