package TwoSum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void twoSum() {
        Solution s = new Solution();
        int[] y = {2, 7, 11, 15};
        int[] r = s.twoSum(y, 9);
        assertEquals(0, r[0]);
        assertEquals(1, r[1]);
    }
}