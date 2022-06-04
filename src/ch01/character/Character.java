package ch01.character;

public abstract class Character {
    WeaponBehavior weapon;
    void fight(){
        weapon.useWeapon();
    }
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
