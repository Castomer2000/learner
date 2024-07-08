package SkillFactory.module6;

public class Monster {
    String name;
    int health;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
        System.out.println("Monster " + name + " attacked with damage " + damage);

    }

    public void growl() {
        System.out.println(name + " growled");
    }

    public void attack() {

    }
}
