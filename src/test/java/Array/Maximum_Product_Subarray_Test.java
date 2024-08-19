package Array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Maximum_Product_Subarray_Test {
    private Maximum_Product_Subarray maximum_product_subarray;

    @Before
    public void setUp() {
        maximum_product_subarray = new Maximum_Product_Subarray();
    }

    @Test
    public void example1() {
        int result = maximum_product_subarray.maxProduct(new int[]{2,3,-2,4});
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void example2() {
        int result = maximum_product_subarray.maxProduct(new int[]{-2,0,-1});
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void example3() {
        int result = maximum_product_subarray.maxProduct(new int[]{-2,3,-4});
        int expected = 24;
        assertEquals(result, expected);
    }
}
