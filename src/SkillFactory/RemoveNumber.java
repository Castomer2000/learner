package SkillFactory;

import java.util.Arrays;

public class RemoveNumber {
    public static int[] remNum(int[] array, int el) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                num++;
            } else {
                array[i - num] = array[i];
            }
        }
        int[] data = new int[array.length - num];
        for (int i = 0; i < data.length; i++) {
            data[i] = array[i];
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] b = remNum(array, 2);
        System.out.println(Arrays.toString(b));

    }
}



