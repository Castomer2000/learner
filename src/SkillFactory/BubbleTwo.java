package SkillFactory;

import java.util.Arrays;

public class BubbleTwo {
    public static void main(String[] args) {
        int l = 100;
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
