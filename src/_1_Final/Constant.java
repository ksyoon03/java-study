package _1_Final;

public class Constant {
    // 상수 - 프로그램 실행부터 종료까지 고정값
    // 실행부터(static), 고정(final)
    // 상수 작명법: 변수 이름을 전부 대문자로 작성, 띄어쓰기는 '_'로 표현

    public static final String GAME_NAME = "리그 오브 레전드";
    public static final String GAME_MODE = "소환사의 협곡";
    public static final int PLAYER_COUNT = 10;
    public static final int MAX_LEVEL = 18;

    // 서버가 시작되고, 끝날때까지 절대로 바뀌면 안되는 값
    public static final int DISCOUNT_THRESHOLD = 50000;
    public static final double DISCOUNT_RATE = 0.1;
}
