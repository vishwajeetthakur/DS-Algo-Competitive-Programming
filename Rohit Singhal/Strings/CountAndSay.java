class Solution {
    public String countAndSay(int n) {
       if(n==1)
       {
           return "1";
       }
        String temp=countAndSay(n-1);
        String ans="";
       
        
        int count=1;
        for(int i=1;i<=temp.length();i++)
        {
         if(i==temp.length())
         {
             ans=ans+count+temp.charAt(temp.length()-1);
         }
             
           else if(temp.charAt(i)==temp.charAt(i-1))
           {
               count++;
           }
            else
            {
                ans=ans+count+temp.charAt(i-1);
                count=1;
            }
        }
        
        return ans;
    }
}
