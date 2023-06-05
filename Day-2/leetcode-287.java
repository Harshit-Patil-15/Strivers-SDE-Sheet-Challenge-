class Solution {
   
    public int findDuplicate(int[] nums) {
    int curr=nums[0]; 
    int ans=0;
    while(true){
      
      if(nums[curr]!=-1){
          int temp=nums[curr];
          nums[curr]=-1;
          curr=temp;
      }else{
          break;
      }
    }
    return curr;
    }
}
