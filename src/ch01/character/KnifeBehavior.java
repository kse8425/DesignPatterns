package ch01.character;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼로 벱니다. 슉!슉!");
    }
}
