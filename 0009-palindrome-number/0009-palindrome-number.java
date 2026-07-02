class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int duplicate = x;

        while(duplicate > 0){
            int last = duplicate % 10;
            duplicate = duplicate / 10;

            reverse = (reverse * 10) + last;
        }
        return reverse == x;
    }
}