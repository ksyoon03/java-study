package _8_NestedClass.anonymous;

public class Main {
    public static void main(String[] args) {
        // 추상체(추상클래스, 인터페이스)
        // 인스턴스 생성 불가능

        // 익명 클래스
        // new Character지만, 실제 인스턴스는 Character가 아님
        // 한 번 쓰고 버릴 클래스
        // Character를 상속받은 익명 인스턴스
        // 항상 업캐스팅 되어진 상태로만 사용가능
        Character ch = new Character("운영자", 999, 99){
            // 정의와 동시에 생성까지
            @Override
            public void attack(Character target){
                System.out.println("운영자 공격!");
                target.receiveDamage(attackDamage);
            }
        };

        // 우리가 추상클래스로부터 구현한 익명클래스 이름
        System.out.println(ch.getClass().getName());

        Hi hi = new Hi() {
            @Override
            public void hello() {
                System.out.println("반갑습니다");
            }
        }; hi.hello();

        // 람다를 쓸 때 인터페이스 익명클래스를 사용하게 됨
        // 자바에서는 메서드가 단독 존재 x
        // 매개변수로 함수를 넘기고 싶음
        // 익명클래스의 객체를 전달
        // - 클래스를 포장지처럼 쓰면 함수 전달 가능
    }
}
