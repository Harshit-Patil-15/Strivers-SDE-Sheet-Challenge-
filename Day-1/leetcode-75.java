
class Solution {
    public void sortColors(int[] nums) {
            
            int l=0,h=nums.length-1,mid=0;
            
            while(mid<=h)
            {
                    if(nums[mid]==0)
                    {
                            int temp=nums[l];
                            nums[l]=nums[mid];
                            nums[mid]=temp;
                            l++;mid++;
                    }
                    else if(nums[mid]==1)
                            mid++;
                    else{
                           int temp=nums[mid];
                            nums[mid]=nums[h];
                            nums[h]=temp;
                            h--;
                    }

            }       
    }
}