class Solution {
    public int removeDuplicates(int[] nums) {
      int j=1;
        int prev=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[prev]){
          
                    nums[j]=nums[i];
               j++;
            }
            prev++;
        }
        return j;
    }
}