package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left = 0;
        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            map.put(s.charAt(right), right);
        }
        return maxLength;
    }
}