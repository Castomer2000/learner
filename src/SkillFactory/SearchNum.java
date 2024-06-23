package SkillFactory;

public class SearchNum {
    public static int search(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[1000000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000000);
        }
        System.out.println(search(nums, 56));
    }
}
