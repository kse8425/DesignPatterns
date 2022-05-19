package ch01;

public class MiniDuckSimulator {
    public static void main(String[] args){
        System.out.println("================================");
        Duck mallard = new MallardDuck();
        mallard.display();      // 저는 물오리입니다.
        mallard.swim();         // 모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠
        mallard.performQuack(); // 꽥
        mallard.performFly();   // 날고 있어요
        System.out.println("================================");

        System.out.println();

        System.out.println("================================");
        Duck model = new ModelDuck();
        model.display();        // 저는 모형 오리입니다.
        model.swim();         // 모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠
        model.performQuack();   // 꽥
        model.performFly();     // 저는 못 날아요

        System.out.println("========= 동적 행동 지정 후 ===========");
        model.setQuackBehavior(new Squeck());
        model.setFlyBehavior(new FlyRocketPowered());
        model.performQuack();   // 삑
        model.performFly();     // 날고 있어요
        System.out.println("================================");
    }
}
