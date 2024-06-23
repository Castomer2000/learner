package SkillFactory;

public class AutoPilot {
    public static void main(String[] args) {

    }
    public static String movement(String colorOfTrafficLight){
        String action = " ";
        if (colorOfTrafficLight == "Red"){
            action = "Остановка";
        }
        else if (colorOfTrafficLight == "Yellow"){
            action = "Подождать";
        }
        else if (colorOfTrafficLight == "Green"){
            action = "Движение";
        }
        return action;
    }
}
