package ReverseInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void reverse() {
        assertEquals(5253, new Solution().reverse(3525));
        assertEquals(0, new Solution().reverse(1534236469));
    }
}