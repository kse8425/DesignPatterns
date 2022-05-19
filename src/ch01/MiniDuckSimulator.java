package ch01;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();      // 저는 물오리입니다.
        mallardDuck.swim();         // 모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠
        mallardDuck.performFly();   // 날고 있어요
        mallardDuck.performQuack(); // 꽥
    }


}
