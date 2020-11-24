class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int len=0;
        int n = nums.size();
        
        
        if(n==0){
            return 0;
        }
        else{
        for(int i=0;i<n-1;i++){
            if(nums[i]!= nums[i+1])
            {
                nums[++len] = nums[i+1];
                
            } 
        }
        
        return ++len;
        }
        
        
        
        
        
    }
    
};
