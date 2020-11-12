class Solution {
    public void rotate(int[] nums, int k) {
        for (int i=0;i<k;i++){
            int last=nums[nums.length-1];
            
            for(int p=nums.length-2;p>=0;p--){
                nums[p+1]=nums[p];
            }
            nums[0]=last;
         //   for( int q=0;q<nums.length;q++)
           //  System.out.println(nums[q]);
        }      
    }
}
