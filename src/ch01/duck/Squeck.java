package ch01.duck;

public class Squeck implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
