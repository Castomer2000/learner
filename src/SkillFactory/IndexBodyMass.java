package SkillFactory;

public class IndexBodyMass {
    public static double indexBody(double mass, double height) {
        return mass / Math.pow(height, 2);
    }

    public static void main(String[] args) {
        double massBody = 94;
        double height = 1.90;
        double index = indexBody(massBody, height);
        if (index < 18.5) {
            System.out.println("Вам необходимо увеличить массу тела");
        } else if (index <= 30) {
            System.out.println("Ваша масса тела оптимальна ");
        } else {
            System.out.println("Вам необходимо похудеть");
        }
    }
}
