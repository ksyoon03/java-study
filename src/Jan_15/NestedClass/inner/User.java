package Jan_15.NestedClass.inner;

public class User {
    private String username;
    private String name;
    private String address;

    private User(Builder builder){
        this.username = builder.name;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String username;
        private String name;
        private String address;

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            User u = new User(this);
            return u;
        }
    }
}
