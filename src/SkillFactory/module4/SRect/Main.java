package SkillFactory.module4.SRect;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(10, 20);
        rect.h = 30;
        System.out.println(rect.getW() * rect.getH() == rect.getS());
    }
}
