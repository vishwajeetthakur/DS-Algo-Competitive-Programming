class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int i=1;
        if(nums.length==1)
        {
            return nums[0];
        }
        while(i<nums.length){
            if(nums[i]==nums[i-1] && i==(nums.length-2))
            { result=nums[i+1];
            break;}
            else if(nums[i]==nums[i-1])
            {i=i+2;}
            else
               { result=nums[i-1];
               break;}
            
        }
        return result;
    }
}
