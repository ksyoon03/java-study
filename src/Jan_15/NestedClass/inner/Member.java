package Jan_15.NestedClass.inner;

public class Member {
    private String name;
    private int age;
    private String email;

    // 빌더패턴 - 생성자를 대체하는 패턴
    // 필드가 많을 때 생성자를 다양하게 오버로딩 해줘야함
    // 생성자는 메서드와 비슷하게 매개변수의 순서가 중요함

    // 내부에서만 생성자 호출
    private Member(Builder builder){
        this.name = builder.name;
        this.age = builder.age;;
        this.email = builder.email;
    }

    // 정적내부 클래스
    // -> Member 클래스로 내부클래스에 접근할 수 있게 메서드 정의
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        // 1. 바깥 클래스의 필드를 동일하게 가진다
        private String name;
        private int age;
        private String email;

        public Builder name(String name){
            // this는 Builder 객체
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        // a.email("~@.com).age(20) -> 메서드 채이닝
        public Builder email(String email){
            this.email = email;
            return this;
        }

        // 바깥클래스의 private 생성자를 내부클래스에서 호출
        public Member build(){
            // builder 객체를 넘겨준다(자기자신)
            Member m = new Member(this);
            return m;
        }
    }
}
