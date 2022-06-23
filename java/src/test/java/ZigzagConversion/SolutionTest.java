package ZigzagConversion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void convert() {
        assertEquals("PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
        assertEquals("AB", new Solution().convert("AB", 1));

    }
}