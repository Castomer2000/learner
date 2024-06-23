package SkillFactory.module4.Tank;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(20);
        tank.turnLeft();
        tank.goForward(50);
        tank.turnRight();
        tank.goBackward(40);
        tank.goBackward(30);
        tank.goForward(50);
        tank.goForward(800);
        tank.printPosition();
        Tank tank1 = new Tank();
        tank1.goForward(60);
        tank1.printPosition();
    }
}
