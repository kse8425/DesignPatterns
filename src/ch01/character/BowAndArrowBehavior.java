package ch01.character;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("화살을 쏩니다. 피융~!");
    }
}
