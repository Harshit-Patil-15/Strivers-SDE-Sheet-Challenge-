class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
         int element1=Integer.MIN_VALUE;
         int element2=Integer.MIN_VALUE;
       int count1=0;int count2=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
           if(count1==0 && nums[i]!=element2){
               count1=1;
               element1=nums[i];
           }else if(count2==0 && nums[i]!=element1){
               count2=1;
               element2=nums[i];
           }else if(nums[i]==element1){
               count1++;
           }else if(nums[i]==element2){
               count2++;
           }else{
               count1--;count2--;
           }
       }
        int cnt1 = 0;int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element1) cnt1++;
             if (nums[i] == element2) cnt2++;
        }

        if (cnt1 > (n / 3)) {
            li.add(element1);
        };
        
        if (cnt2 > (n / 3)) {
            li.add(element2);
        };
        return li;
    }
}