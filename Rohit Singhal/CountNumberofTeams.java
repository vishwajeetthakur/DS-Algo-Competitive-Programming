class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        for(int i=0;i<rating.length-2;i++)
        {
           
            for(int j=i+1;j<rating.length-1;j++)
            {
            int k=rating.length-1;
            while(j<k)
            {
                 if(rating[i] < rating[j] && rating[j]< rating[k])
                    {
                        count++;
                    }
                    if(rating[i] > rating[j] && rating[j] > rating[k])
                    {
                        count++;
                    }
                k--;
            }
            }
        }
        return count;
        
    }
}
