package LongestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters.Solution s =
            new LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(2, s.lengthOfLongestSubstring("au"));
        assertEquals(3, s.lengthOfLongestSubstring("abcabc"));
    }
}