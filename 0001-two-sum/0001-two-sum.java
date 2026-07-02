class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int [2]; int k=0,i,j;
     for (i=0;i<nums.length;i++)
     {
        for (j=i+1;j<nums.length;j++)
        {
        if((nums[i]+nums[j])==target)
        {
            arr[k]=i;
            arr[k+1]=j;
            k+=2;
        }
        }
     } 
     return arr;  
    }
}