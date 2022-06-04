package ch01.character;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍습니다. 꽝!");
    }
}
