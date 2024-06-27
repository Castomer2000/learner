package SkillFactory.LeetCode;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    res[1] = i;
                    res[0] = j;
                }
            }
        }
        return res;
    }
}
