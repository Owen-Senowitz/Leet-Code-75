package Array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Maximum_Subarray_Test {
    private Maximum_Subarray maxSubarray;

    @Before
    public void setUp() {
        maxSubarray = new Maximum_Subarray();
    }

    @Test
    public void example1() {
        int result = maxSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void example2() {
        int result = maxSubarray.maxSubArray(new int[]{1});
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void example3() {
        int result = maxSubarray.maxSubArray(new int[]{5,4,-1,7,8});
        int expected = 23;
        assertEquals(result, expected);
    }

    @Test
    public void example4() {
        int result = maxSubarray.maxSubArray(new int[]{-1});
        int expected = -1;
        assertEquals(result, expected);
    }
}
