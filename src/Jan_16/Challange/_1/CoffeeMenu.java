package Jan_16.Challange._1;

public enum CoffeeMenu {
    AMERICANO("아메리카노",4000),
    LATTE("라떼", 4500),
    MOCHA("모카",5000)
    ;

    private String name;
    private int price;

    CoffeeMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int calculatePrice(int count){
        return this.price * count;
    }
}
