package ZigzagConversion;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
class Solution {
    public String convert(String s, int numRows) {
        String returnString = "";

        if (numRows == 1) {
            return s;
        }
        StringBuilder[] tmp = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            tmp[i] = new StringBuilder();
        }
        tmp[0].append(s.charAt(0));
        int index = 0;
        int step = 1;
        for (int i = 1; i < s.length(); i++) {
            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }
            index = index + step;
            tmp[index].append(s.charAt(i));
        }
        for (int i = 0; i < numRows; i++) {
            returnString = returnString + tmp[i].toString();
        }
        return returnString;
    }
}