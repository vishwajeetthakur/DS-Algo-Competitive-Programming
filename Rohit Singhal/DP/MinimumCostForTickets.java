class Solution {
    
     public int mincostTickets(int[] days, int[] costs,int si,int[] dp)
     {
         if(si>=days.length)
         {
             return 0;
         }
         if(dp[si]!=-1)
         {
             return dp[si];
         }
         int option1=mincostTickets(days,costs,si+1,dp)+costs[0];
         int index=si;
         while(index<days.length)
           {
            
             if(days[index]>=days[si]+7)
             {
                 break;
             }
              index++;
         }
         int option2=mincostTickets(days,costs,index,dp)+costs[1];
         
        
           index=si;
         while(index<days.length)
           {
             
             if(days[index]>=days[si]+30)
             {
                 break;
             }
             index++;
         }
         int option3=mincostTickets(days,costs,index,dp)+costs[2];
         
         return dp[si]=Math.min(option1,Math.min(option2,option3));
         
     }
    
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length];
        Arrays.fill(dp,-1);
        return mincostTickets(days,costs,0,dp);
        
    }
}
