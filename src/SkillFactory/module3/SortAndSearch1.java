package SkillFactory.module3;

public class SortAndSearch1 {
    public static void main(String[] args) {
        int[] nums = {5, 24, 3, 66, 38, 16, 27};
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;

        }
        System.out.println(nums[2]);
    }
}
