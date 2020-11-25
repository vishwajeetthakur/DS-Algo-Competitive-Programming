class Solution {
    
    public int helper(int n,int[] storage )
    {
        if(n<=2)
		{                              //base condition
			return n;     
		}
        if(storage[n]!=-1)
        {
            return storage[n];
        }
        
         storage[n]=helper(n-1,storage)+helper(n-2,storage);
        return storage[n];
    }
    
    
    
        
        public int climbStairs(int n) {
             if(n<=2)
		{                              //base condition
			return n;     
		}
        
		int[] storage=new int[n+1];
        Arrays.fill(storage,-1);
        storage[1]=1;
        storage[2]=2;   
       return helper(n,storage);
		// return climbStairs(n-1)+climbStairs(n-2);
        
    }
}
