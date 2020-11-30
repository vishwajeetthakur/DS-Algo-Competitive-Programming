class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Integer> dict=new HashMap<>();
        for(int i=0;i<wordDict.size();i++)
        {
            dict.put(wordDict.get(i),1);
        }
        int[] dp=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                String word=s.substring(j,i+1);
                if(dict.containsKey(word))
                {
                    if(j==0)
                    {
                        dp[i]+=1;
                    }
                    else
                    {
                        dp[i]+=dp[j-1];
                    }
                }
            }
        }
        if(dp[s.length()-1]!=0)
        {
            return true;
        }
        else
            return false;
        
    }
}
