package SkillFactory.PracticeWeek;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age) {
        this.name = "Name";
        this.age = 30;
        this.weight = 70;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.weight = 70;
        this.age = 30;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.weight = 70;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Vladimir";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
