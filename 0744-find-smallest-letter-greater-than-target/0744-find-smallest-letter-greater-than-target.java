class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i,k;
        if ((int)target>=(int)letters[letters.length-1])
        {
            return letters[0];
        }
     for (i=0;i<letters.length;i++)
     {
        if((int)(target)==(int)(letters[i]))
        {
            k=i;
            while((int)(target)==(int)(letters[k+1]))
            {
                k++;
            }
            return letters[k+1];

        }
        else if ((int)target<(int)letters[i])
        {
            return letters[i];
        }
     } return letters[0];  
    }
}