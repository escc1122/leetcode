package StringToIntegerAto;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void myAtoi() {
        Solution s = new Solution();
        assertEquals(42, s.myAtoi("42"));
        assertEquals(0, s.myAtoi("words and 987"));
        assertEquals(-2147483648, s.myAtoi("-91283472332"));
        assertEquals(2147483647, s.myAtoi("2147483648"));
    }
}