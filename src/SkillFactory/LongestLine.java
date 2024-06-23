package SkillFactory;

public class LongestLine {
    public static String LongLine(String[] lines) {
        String max = lines[0];
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > max.length()) {
                max = lines[i];
            }
        }
        return max;
    }

    public static String Palindrome(String line) {
        line = line.toLowerCase();
        char[] array = line.toCharArray();
        String res = " ";
        for (int i = 0; i < line.length(); i++) {
            res = res + array[line.length() - 1 - i];
        }
        return res;
    }

    public static void main(String[] args) {
        String[] lines = new String[5];
        lines[1] = "Теплое место";
        lines[2] = "На улице ждут";
        lines[3] = "Отпечатков наших ног";
        lines[4] = "Звездная пыль";
        lines[0] = "На сапогах";
        //System.out.println(LongLine(lines));
        String a = "Привет дорогая";
        System.out.println(Palindrome(a));
    }
}
