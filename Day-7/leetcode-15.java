

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
       int lo=i+1;int high=nums.length-1;
       while(lo<high){
           long sum=nums[i];
           sum+=nums[lo];
           sum+=nums[high];
           if(sum==0) {
               List<Integer> li=new ArrayList<>();
               li.add(nums[i]);
               li.add(nums[lo]);
               li.add(nums[high]);
               ans.add(li);
                  lo++;high--;
                 while(lo<high &&nums[lo-1]==nums[lo]) lo++;
                        while(lo<high &&nums[high+1]==nums[high]) high--;
            
        
           }else if(sum<0){
       lo++;
           }else{
               high--;
           }