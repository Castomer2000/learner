package SkillFactory;

import java.util.Arrays;

public class TestSort {

    public static void main(String[] args) {
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        System.out.println(array[2]);
    }
}