class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        vector<int> r;
        int element=0;
        
        for(vector<int>::iterator itr=nums.begin();itr !=nums.end();itr++){
            
            element=*itr;
            
            if(find(r.begin(),r.end(),element)!=r.end()){
                nums.erase(itr);
                itr--;
                
            }else
            {
                r.push_back(*itr);
            }
        }
        
        
        return nums.size();
        
    }
};
