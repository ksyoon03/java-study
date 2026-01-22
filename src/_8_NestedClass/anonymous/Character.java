package _8_NestedClass.anonymous;

// 추상클래스: 추상메서드를 하나 이상 포함하는 클래스
// 추상메서드: 메서드의 시그니처만 정의하고, 구현(body)를 생략함
public abstract class Character {
    protected String name;
    protected int hp;
    protected int attackDamage;

    public Character(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    // abstract를 적으면 추상 메서드 메서드의 body 영역이 없고,
    // 오로지 시그니처만 정의한 메서드
    public abstract void attack(Character target);
    // 추상클래스를 상속 받으면, 반드시 추상 메서드를 구현해야한다.
    // -> 오버라이딩이 강제됨

    // 일반 메서드도 정의할 수 있음
    public void receiveDamage(int damage){
        this.hp -= damage;
        if(this.hp <= 0){
            this.hp = 0;
            System.out.println(this.name + "가 쓰러졌습니다.");
        }
    }

    public String getName(){
        return this.name;
    }
}
