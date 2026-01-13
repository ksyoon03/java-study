package Jan_13.Abstract;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이(가) " + targetName + "에게 다중화살을 쏩니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이(가) " + attackDamage + "의 데미지를 받았습니다.");
    }
}
