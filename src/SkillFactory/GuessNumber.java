package SkillFactory;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи пределы угадываемого числа");
        int numLower = scanner.nextInt();
        int numUpper = scanner.nextInt();
        System.out.println("Введи количество попыток");
        int numAttempt = scanner.nextInt();
        Random random = new Random();
        int randomInt = numLower + random.nextInt(numUpper - numLower + 1);
        System.out.println("Угадай число");
        int counter = 1;
        boolean status = false;
        while (counter <= numAttempt) {
            int number = scanner.nextInt();
            if (number == randomInt) {
                System.out.println("Поздравляю, ты угадал");
                status = true;
                break;
            } else if (number < randomInt) {
                System.out.println("Ты ввел число меньше загаданного");
                status = false;
            } else {
                System.out.println("Ты ввел число больше загаданного");
                status = false;
            }
            counter++;
        }
        if (status == false) {
            System.out.println("Ты не смог угадать, это было число " + randomInt);
        }
    }
}