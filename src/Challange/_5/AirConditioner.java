package Challange._5;

public class AirConditioner implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("에어컨 전원을 켭니다.");
    }

    public void turboCool(){
        System.out.println("파워 냉방을 시작합니다.");
    }
}
