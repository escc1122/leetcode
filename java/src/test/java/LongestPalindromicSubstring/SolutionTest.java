package LongestPalindromicSubstring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        Solution s = new Solution();
        assertEquals("bab", s.longestPalindrome("babad"));
        assertEquals("ccc", s.longestPalindrome("ccc"));
        assertEquals("aca", s.longestPalindrome("aacabdkacaa"));
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }
}