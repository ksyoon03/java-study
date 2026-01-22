package _6_Singleton;

public class LogManager {
    /*
    디자인패턴 - 싱글톤(스프링부트, 서버)
    프로그램에서 단 하나의 객체(인스턴스)를 공유하도록 하고 싶다.
    -> 객체를 여러번 new를 하는게 아니라, 한 번 만들고 재사용한다.
    상태가 없는(필드값 고정) 객체들을 적용
     */

    // 상태가 고정값 - static
    // 외부접근을 막음 - private
    // 공유할 자기자신 타입의 필드를 가지고 있음
    private static LogManager instance;

    // 기본 생성자 - private으로 외부 접근을 막는다
    private LogManager(){}

    // 외부 접근용 메서드
    public static LogManager getInstance(){
        // if문은 getInstance가 최초 호출될 때 실행
        if(instance == null){
            instance = new LogManager();
        }

        return instance;
    }

    /*
    1. 생성자 - 외부에서 new 못하게 private
    2. 공유할 객체 변수를 필드로 가진다.
    3. 외부에서 접근가능한 메서드로 단 하나의 인스턴스만 리턴한다.
     */

    public void log(String msg){
        System.out.println("LOG: " + msg);
    }
}
