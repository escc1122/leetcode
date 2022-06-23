package ReverseInteger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-integer/
 * https://leetcode.com/problems/reverse-integer/discuss/4060/My-accepted-15-lines-of-code-for-Java
 */
class Solution {
    public int reverse(int x) {
        int returnValue = 0;
        int tmpValue = 0;
        while (x != 0) {
            int tail = x % 10;
            tmpValue = 10 * returnValue + tail;
            if (((tmpValue - tail) / 10) != returnValue) {
                return 0;
            }
            returnValue = tmpValue;
            x = x / 10;
        }
        return returnValue;
    }
}