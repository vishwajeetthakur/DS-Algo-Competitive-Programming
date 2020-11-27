class Solution {
    
    
    
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=1)
        {
            return nums.length;
        }
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=1;
        int ans=0;
        for(int i=1;i<nums.length;i++)
        {
            int temp=0;
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[j]>temp)
                    {
                        temp=dp[j];
                    }
                }
            }
            dp[i]=temp+1;
            if(dp[i]>ans)
            {
                ans=dp[i];
            }
        }
        return ans;
        
        
    }
}
