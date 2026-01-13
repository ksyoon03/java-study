package Jan_12.Final;

public class FinalMain {
    public static void main(String[] args) {
        // final: 반드시 한 번만 초기화 가능
        // 1. 재대입이 불가능
        // 2. 반드시 초기화가 되어야함
        final int data1 = 20;
        final int data2 = 20;
        // data2 = 30;

        FinalStudent st1 =
                new FinalStudent("김자바", 20223000, 20);
        final FinalStudent st2
                = new FinalStudent("이자바", 20212000, 23);
        st2.setAge(21);

        //final 키워드가 붙어져 있는데, 객체의 필드값은 변경 가능할까?
        // 결론: final은 stack 메모리에 있는 값을 변경하지 못하게 막는 것

        // final로 재대입을 막아주고 있는데, 재대입을 막는건
        // 1. JVM (x)
        // 2. 컴파일러 (o)

        // 상수
        // 매직넘버, 매직스트링
        String gameName = "리그 오브 레전드";
        String gameMode = "소환사의 협곡";
        int playerCount = 10;

        System.out.println("게임명: " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.GAME_MODE);
        System.out.println("플레이어 수: " + Constant.PLAYER_COUNT);

        int playerLevel = 18;
        // 레벨업 로직
        if(playerLevel + 1 > Constant.MAX_LEVEL) { // 18레벨이 최대 레벨
            System.out.println("이미 최대 레벨에 도달했습니다.");
        } else {
            System.out.println("레벨업!");
            playerLevel++;
        }

        int price = 100000; // 사용자 입력값
        // 5만원 이상 결제 시 10% 할인
        double discountPrice = 0.0;
        if (price > Constant.DISCOUNT_THRESHOLD) { // 할인 경계 초과면~
            double discountAmount = price * Constant.DISCOUNT_RATE; // 할인율
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }
        System.out.println("최종 결제액: " + discountPrice);

    }
}
