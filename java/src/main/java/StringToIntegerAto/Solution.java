package StringToIntegerAto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int value = 0;
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '+') {
            sign = 1;
            index++;
        } else if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        }

        for (int i = index; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if ((0 <= c && c <= 9)) {
                int oldValue = value;
                value = value * 10;
                if (sign == 1) {
                    value = value + c;
                    if ((value - c) / 10 != oldValue || value<0) {
                        value = Integer.MAX_VALUE;
                        break;
                    }
                } else {
                    value = value - c;
                    if ((value + c) / 10 != oldValue || value>0) {
                        value = Integer.MIN_VALUE;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return value;
    }
}