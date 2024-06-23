package SkillFactory.module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberGeneration {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");
        for (int aCount = 1000000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if (matcher.find()) {
                System.out.println(stringBuilder.append("+7 (926)").append(matcher.group(1)).append("-").append(matcher.group(2)).append("; "));
            }
        }
    }
}
