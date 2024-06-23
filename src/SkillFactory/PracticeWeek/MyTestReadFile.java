package SkillFactory.PracticeWeek;

import java.io.*;
import java.util.Scanner;

public class MyTestReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        String path = sep + "D:" + sep + "Projects" + sep + "learner" + sep + "NewTest.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
