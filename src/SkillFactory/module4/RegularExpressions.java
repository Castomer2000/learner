package SkillFactory.module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[b - m]");
        Matcher matcher1 = pattern.matcher("bdefgh");
        System.out.println(matcher1.find());
    }
}
