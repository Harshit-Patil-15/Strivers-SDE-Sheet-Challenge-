class Solution {
    public int majorityElement(int[] nums) {
       int element=nums[0];
       int count=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
           if(count==0){
               count=1;
               element=nums[i];
           }else if(nums[i]==element){
               count++;
           }else{
               count--;
           }
       }
           int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) cnt1++;
        }

        if (cnt1 > (n / 2)) return element;
        return -1;
    }
}