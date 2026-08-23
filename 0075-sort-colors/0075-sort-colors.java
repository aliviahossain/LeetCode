class Solution {
    public void sortColors(int[] nums) {
        int i0 = 0, i1 = 0, i2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                i0++;
            else if (nums[i] == 1)
                i1++;
            else
                i2++;
        }

        int i = 0;

        while (i0 > 0) {
            nums[i] = 0;
            i++;
            i0--;
        }

        while (i1 > 0) {
            nums[i] = 1;
            i++;
            i1--;
        }

        while (i2 > 0) {
            nums[i] = 2;
            i++;
            i2--;
        }
    }
}