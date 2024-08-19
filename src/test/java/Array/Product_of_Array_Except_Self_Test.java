package Array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Product_of_Array_Except_Self_Test {

    private Product_of_Array_Except_Self productOfArrayExceptSelf;

    @Before
    public void setUp() {
        productOfArrayExceptSelf = new Product_of_Array_Except_Self();
    }

    @Test
    public void example1() {
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});
        int[] expected = new int[] {24, 12, 8, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void example2() {
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});
        int[] expected = new int[] {0, 0, 9, 0, 0};
        assertArrayEquals(expected, result);
    }
}
