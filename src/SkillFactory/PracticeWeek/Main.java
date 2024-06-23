package SkillFactory.PracticeWeek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{3, 8}, {8, 9}, {9, 7},{96, 7}};
        ToLine toLine = new ToLine(a);
        System.out.println(Arrays.toString(toLine.resize()));

    }
}
