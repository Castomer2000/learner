package SkillFactory.module3;

import java.util.Arrays;

public class Controller3 {
    public static int[] sumRes(int[][] res) {
        int[] sums = new int[res.length];
        int a = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                sums[i] += res[i][j];
            }
        }
        return sums;
    }

    public static String[] resToString(int[] sumRes) {
        String[] res = new String[sumRes.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.toString(sumRes[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] names = {
                "Саша",
                "Игорь",
                "Миша",
                "Коля",
                "Владимир"};
        int[][] res = {
                {1, 2, 9, 4, 5},
                {4, 7, 9, 6, 1},
                {4, 8, 0, 6, 7},
                {5, 9, 7, 8, 9},
                {12, 3, 0, 9, 6}
        };

        String[] total = resToString(sumRes(res));
        String[] b = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            b[i] = names[i] + " " + total[i];
            System.out.println(b[i]);
        }

    }
}
