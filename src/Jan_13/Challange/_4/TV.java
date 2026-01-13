package Jan_13.Challange._4;

public class TV implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    public void watchNetflix() {
        System.out.println("넷플릭스를 켭니다.");
    }
}
