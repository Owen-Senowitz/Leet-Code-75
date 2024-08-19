package Array;

//https://leetcode.com/problems/product-of-array-except-self/
public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] leftProducts = new int[length];
        int[] rightProducts = new int[length];
        int[] results = new int[length];

        leftProducts[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        rightProducts[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            results[i] = leftProducts[i] * rightProducts[i];
        }

        return results;
    }
}
