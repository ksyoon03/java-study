package Challange._7;

public class UserCounter {
    private Integer count = 0;

    private static UserCounter instance;

    private UserCounter(){}

    public static UserCounter getInstance(){
        if(instance == null){
            instance = new UserCounter();
        }
        return instance;
    }

    public void visit(){
        int tmp = count;
        tmp += 1;
        count = tmp;
    }

    public int getCount(){
        return count;
    }
}
