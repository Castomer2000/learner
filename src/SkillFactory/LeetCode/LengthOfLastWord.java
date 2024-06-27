package SkillFactory.LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        int lengthWord = lastWord.length();
        return lengthWord;
    }
}
