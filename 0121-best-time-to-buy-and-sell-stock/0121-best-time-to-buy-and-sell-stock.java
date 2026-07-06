class Solution {
    public int maxProfit(int[] pr) {
        int p = 0;
        int min = pr[0];

        for(int i : pr) {
            p = Math.max(i-min,p);
            min = Math.min(i,min);
        }

        return p;
    }
}