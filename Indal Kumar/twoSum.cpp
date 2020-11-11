class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int,int> m;
        
        int n=nums.size();
        
        for(int i=0;i<n;i++){
            
            int num=nums[i];
            int c=target-num;
            auto it=m.find(c);
            
            if(it!=m.end()){
                return {it->second,i};
            }else{
                m[num]=i;
                
            }
        }
        return {};
        
    }
};
