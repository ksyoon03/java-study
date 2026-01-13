package Jan_13.Challange._2;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        Camera camera = (Camera) smartPhone;
        camera.takePhoto();

        MusicPlayer musicPlayer = (MusicPlayer) smartPhone;
        musicPlayer.playMusic();

        Phone phone = (Phone) smartPhone;
        phone.call();
    }
}
