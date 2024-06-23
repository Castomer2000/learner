package SkillFactory.LeetCode;

public class Work {

    public String mergeAlternately(String word1, String word2) {

        String word3 = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                word3 += word1.charAt(i);
            if (i < word2.length())
                word3 += word2.charAt(i);
        }
        return word3;
    }
}

