package SkillFactory;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i]);
        }
        System.out.println(" ");
        System.out.println(min(a));
        System.out.println(" ");
        System.out.println(max(a));
        System.out.println(" ");
        System.out.println(average(a));
    }

    public static int min(int[] a) {
        int b = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] < b) {
                b = a[j];
            }
        }
        return b;
    }

    public static int max(int[] a) {
        int b = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > b) {
                b = a[j];
            }
        }
        return b;
    }

    public static int average(int[] a){
        int aver = 0;
        for (int b = 0; b < a.length; b++) {
            aver += a[b] / a.length;
        }
        return aver;
    }
}