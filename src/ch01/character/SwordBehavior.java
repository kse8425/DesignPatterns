package ch01.character;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검으로 찌릅니다. 푹푹~!");
    }
}
