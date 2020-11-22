class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
        {
            return 0;
        }
        if(needle.length()==1 && haystack.length()==1)
        {
            if(needle.charAt(0)==haystack.charAt(0))
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
                
                if(j==n-1)
                {
                    return i;
                }
            }
            
        }
        return -1;
        
        
    }
}
