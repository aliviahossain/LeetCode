class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k == 0 && isSortable(nums, k)) {
                ans += k;
            }
        }

        return ans;
    }

    private boolean isSortable(int[] nums, int k) {
        int n = nums.length;
        int prevMax = Integer.MIN_VALUE;

        for (int start = 0; start < n; start += k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int drops = 0;

            for (int i = start; i < start + k; i++) {
                int next = (i + 1 == start + k) ? start : i + 1;

                if (nums[i] > nums[next]) {
                    drops++;
                }

                if (drops > 1) {
                    return false;
                }

                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }

            if (min < prevMax) {
                return false;
            }

            prevMax = max;
        }

        return true;
    }
}