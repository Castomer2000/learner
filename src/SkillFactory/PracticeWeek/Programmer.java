package SkillFactory.PracticeWeek;

public class Programmer {
    String name, company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "Intern";
    }

    String getPosition() {
        return position;
    }

    void work() {
        switch (position) {
            case "Intern":
                position = "Junior";
                break;
            case "Junior":
                position = "Middle";
                break;
            case "Middle":
                position = "Senior";
                break;
            case "Senior":
                position = "Lead";
                break;
        }
    }
}
