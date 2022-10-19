//https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums)
            set.add(num);
        return !(set.size() == nums.length);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        containsDuplicate(nums);
    }
}
