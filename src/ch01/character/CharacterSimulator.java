package ch01.character;

public class CharacterSimulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        Character king = new King();
        Character knight = new Knight();
        Character troll = new Troll();

        queen.fight();
        king.fight();
        knight.fight();
        troll.fight();
        troll.setWeapon(new KnifeBehavior());
        troll.fight();
    }
}
