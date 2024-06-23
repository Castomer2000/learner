package SkillFactory;

import java.util.Scanner;

public class InputPassword {
    public static void main(String[] args) {
        System.out.println("Придумайте имя пользователя и пароль");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean checkPass = pass.length() > 7 && pass.length() < 16;
        if (!checkPass) {
            do {
                System.out.println("Длина пароля от 8 до 15 символов");
                pass = scanner.nextLine();
            } while (checkPass);
        }

        System.out.printf("%s, Ваш новый пароль %s", name, pass);
    }
}