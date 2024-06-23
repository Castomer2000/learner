package SkillFactory.module3;

import java.util.Scanner;

public class StringHandler {
    static Scanner scanner = new Scanner(System.in);

    public static char getOperation() {
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Unacceptable operation");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static String getString() {
        String text;
        if (scanner.hasNextLine()) {
            text = scanner.nextLine();
        } else {
            System.out.println("Incorrect input");
            scanner.next();
            text = getString();
        }
        return text;
    }

    public static String removeSpace(String text) {
        return text.replaceAll(" ", "");
    }

    public static String lowerLetters(String text) {
        return text.toLowerCase();
    }

    public static String upperLetters(String text) {
        return text.toUpperCase();
    }

    public static int amountChars(String text) {
        return text.length();
    }

    public static String handler(String text, char operation) {
        String result = getString();
        switch (operation) {
            case '-':
                result = removeSpace(text);
                break;
            case '>':
                result = lowerLetters(text);
                break;
            case '<':
                result = upperLetters(text);
                break;
            case '*':
                result = String.valueOf(amountChars(text));
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean status = true;
        while (status) {
            System.out.println("Введите фразу");
            String text = getString();
            System.out.println("Выберите действие: - убрать пробелы; < сделать буквы заглавными; > сделать буквы сторчными; " +
                    "* подсчитать количество символов");
            char operation = getOperation();
            if (operation == '0') break;
            System.out.println(handler(text, operation));
        }
    }
}
