package LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 1;
        String maxString = Character.toString(s.charAt(0));
        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                ArrayList<Integer> points = map.get(s.charAt(right));
                for (int i = 0; i < points.size(); i++) {
                    int leftPoint = points.get(i);
                    int currLength = right + 1 - leftPoint;
                    if (currLength <= maxLength) {
                        break;
                    }
                    boolean isPalindrome = true;
                    for (int j = 1; j < (right - leftPoint) / 2 + 1; j++) {
                        char l = s.charAt(leftPoint + j);
                        char r = s.charAt(right - j);
                        if (s.charAt(leftPoint + j) != s.charAt(right - j)) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        maxString = s.substring(leftPoint, right + 1);
                        maxLength = currLength;
                    }
                }
            }
            ArrayList a;
            if (map.containsKey(s.charAt(right))) {
                a = map.get(s.charAt(right));
            } else {
                a = new ArrayList();
                map.put(s.charAt(right), a);
            }
            a.add(right);
        }
        return maxString;
    }
}