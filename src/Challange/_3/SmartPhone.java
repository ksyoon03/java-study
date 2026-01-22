package Challange._3;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void takePhoto() {
        System.out.println("찰칵! 사진을 찍습니다.");
    }

    @Override
    public void playMusic() {
        System.out.println("빠바밤~ 음악을 틉니다.");
    }

    @Override
    public void call() {
        System.out.println("따르릉~ 전화를 겁니다.");
    }
}
