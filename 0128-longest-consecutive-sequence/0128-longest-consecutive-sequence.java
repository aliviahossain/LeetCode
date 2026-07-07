import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int k = 0;
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                k++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                k = 0;
            }

            if (k > max) {
                max = k;
            }
        }

        return max + 1;
    }
}