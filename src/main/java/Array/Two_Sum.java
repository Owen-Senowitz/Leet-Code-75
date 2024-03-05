package Array;//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answerArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        answerArray[0] = i;
                        answerArray[1] = j;
                        return answerArray;
                    }
                }
            }
        }
        return answerArray;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
