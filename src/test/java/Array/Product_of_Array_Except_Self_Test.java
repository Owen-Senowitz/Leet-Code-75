package Array;

import org.junit.Assert;
import org.junit.Test;

public class Product_of_Array_Except_Self_Test {
    @Test
    public void example1() {
        Product_of_Array_Except_Self productOfArrayExceptSelf = new Product_of_Array_Except_Self();
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});
        int[] expected = new int[] {24, 12, 8, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void example2() {
        Product_of_Array_Except_Self productOfArrayExceptSelf = new Product_of_Array_Except_Self();
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});
        int[] expected = new int[] {0, 0, 9, 0, 0};
        Assert.assertArrayEquals(expected, result);
    }
}
