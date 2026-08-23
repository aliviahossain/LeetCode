class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0,max=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]!=1)
        {
            if(k>max)
            {
                max=k;
            }
            k=0;
        }
        else
        {
            k++;
        }
     } if(k>max)
     {
        max=k;
     }
     return max;  
    }
}