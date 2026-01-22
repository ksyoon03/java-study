package _9_Enum;

public enum Payment {
    CASH("현금", 0),
    CARD("카드", 2),
    MOBILE("핸드폰 결제", 5),
    ;

    private String name;
    private int charge;

    Payment(String name, int charge){
        this.name = name;
        this.charge = charge;
    }

    public int getCharge(){
        return charge;
    }

    public double getFinalCharge(int price){
        double finalCharge = price * charge / 100.0;
        return finalCharge;
    }

    public String getName(){
        return name;
    }
}
