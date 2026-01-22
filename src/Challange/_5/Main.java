package Challange._5;

public class Main {
    public static void main(String[] args) {
        RemoteControl[] remoteControls = new RemoteControl[2];
        remoteControls[0] = new TV();
        remoteControls[1] = new AirConditioner();

        for(RemoteControl remote : remoteControls){
            remote.turnOn();
            if(remote instanceof TV){
                ((TV) remote).watchNetflix();
            }
            if(remote instanceof AirConditioner){
                ((AirConditioner) remote).turboCool();
            }
            System.out.println("----------------");
        }
    }
}
