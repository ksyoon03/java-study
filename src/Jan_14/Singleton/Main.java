package Jan_14.Singleton;

public class Main {
    public static void main(String[] args) {
        // static 메서드로만 객체에 접근가능
        LogManager logger1 = LogManager.getInstance();
        LogManager logger2 = LogManager.getInstance();

        // 정말로 같은 객체일까? (같은 주소일까?)
        System.out.println(logger1 == logger2);

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config1 == config2); // true

        // 설정값(객체 상태)을 공유한다.
        System.out.println("1: " + config1);
        System.out.println("2: " + config2);

        config1.setAppMode("PRODUCTION_MODE");
        System.out.println("1: " + config1);
        System.out.println("2: " + config2);
    }
}
