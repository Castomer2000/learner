package SkillFactory;

public class Cycle {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println(index);
            index = index - 1;
        }
    }

}
