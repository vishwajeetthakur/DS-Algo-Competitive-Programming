class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int ans=0;
        int[] dp=new int[nums.length];
        
        dp[0]=nums[0];
        dp[1]=ans=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i+=2)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            if(dp[i]>ans)
            {
                ans=dp[i];
            }
        }
        for(int i=3;i<nums.length;i+=2)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            if(dp[i]>ans)
            {
                ans=dp[i];
            }
        }
        return ans;
        
        
        // if(nums.length == 1) return nums[0];
        // int [] memo = new int[nums.length];
        // Arrays.fill(memo, -1);
        // int a = helper(nums, 0, memo, nums.length - 2);
        // Arrays.fill(memo, -1);
        // int b = helper(nums, 1, memo, nums.length - 1);
        // return Math.max(a,b);
    }
    
//     public int helper(int[] nums, int i, int[] memo, int hi){
//         if(i > hi) return 0;
//         if(memo[i] != -1)
//             return memo[i];
//         memo[i] = Math.max(helper(nums, i+1, memo, hi),nums[i] + helper(nums, i+2, memo, hi));
//         return memo[i];
//     }
}
