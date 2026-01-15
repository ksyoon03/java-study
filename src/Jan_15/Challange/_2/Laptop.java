package Jan_15.Challange._2;

public class Laptop {
    private String model;
    private int price;

    private Laptop(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }

    public static Builder builder(){return new Builder();}

    static class Builder{
        private String model;
        private int price;

        public Builder getModel(String model){
            this.model = model;
            return this;
        }

        public Builder getPrice(int price){
            this.price = price;
            return this;
        }

        public Laptop build(){
            Laptop laptop = new Laptop(this);
            return laptop;
        }
    }
}
