class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        map<int,int> m;
        vector<int> v;
        
        for(int i: nums1){
            ++m[i];
        }
         for(int i: nums2){
            if(m[i]>0){
                --m[i];
                v.push_back(i);     
            }
        }
        return v;
    }
};
