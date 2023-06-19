class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l=0;
        int r =nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[r]!=nums[r-1]){
            return nums[r];
        }
        while(l<=r){
           int mid=l+(r-l)/2;
            
            if(nums[mid-1]!=nums[mid]   && nums[mid+1]!=nums[mid]){
                return nums[mid];
            }
            if(mid%2==0){
                if(nums[mid-1]==nums[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }

            }else{
             if(nums[mid-1]==nums[mid]){
                 l=mid+1;
             }else{
                 r=mid-1;
             }
            }
            
        }
        return -1;
    }
}
*/