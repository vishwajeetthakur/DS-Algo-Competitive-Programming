class Solution {
    public int helper(String text1, String text2,int[][] dp,int row,int col)
    {
        if(row>=text1.length() || col>=text2.length())
        {
            return 0;
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        if(text1.charAt(row)==text2.charAt(col))
        {
            dp[row][col]=1+helper(text1,text2,dp,row+1,col+1);
        }
        else
        {
            dp[row][col]=Math.max(helper(text1,text2,dp,row+1,col),helper(text1,text2,dp,row,col+1));
        }
        return dp[row][col];
    }
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        {
            for(int j=0;j<text2.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        return helper(text1,text2,dp,0,0);
        
    }
}
