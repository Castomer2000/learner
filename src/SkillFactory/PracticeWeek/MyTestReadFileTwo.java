package SkillFactory.PracticeWeek;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyTestReadFileTwo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Документы\\Тексты песен Арии\\1987 - Герой асфальта\\01 - На службе силы зла.txt");
        Scanner scanner = new Scanner(fr);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
