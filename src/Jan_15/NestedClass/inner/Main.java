package Jan_15.NestedClass.inner;

public class Main {
    public static void main(String[] args) {
        Member m1 = Member // 클래스 참조
                .builder() // static 메서드 호출
                .name("홍길동") // Builder 객체에 set
                .age(20) // Builder 객체에 set
                .email("java@email.com") // Builder 객체에 set
                .build(); // 그대로 필드값들을 복사해서 m1으로 전달

        LombokUser u1 = LombokUser.builder()
                .username("롬복맨")
                .name("롬복")
                .address("미국")
                .build();

        LombokUser u2 = new LombokUser(
                "롬복맨",
                "롬복",
                "미국"
        );

        System.out.println();
    }
}
