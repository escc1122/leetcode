package TwoSum;

/**
 * https://leetcode.com/problems/two-sum/
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            int d = target - s;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == d) {
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return r;
    }
}