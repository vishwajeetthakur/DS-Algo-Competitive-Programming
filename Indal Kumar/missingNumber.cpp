class Solution {
public:
    int missingNumber(vector<int>& nums) {
        
        int n=nums.size();
        
        int formula=n*(n+1)/2;
        
        int sum=0;
        
        for(auto itr:nums){
            
            sum=sum+itr;
        }
        
        int result = formula-sum;
        
        return result;
    }
};
