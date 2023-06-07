class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
         Set < Integer > hashset = new HashSet < Integer > ();
        for (int num: nums) {
            hashset.add(num);
        }
       for(int num:nums){
           if(!hashset.contains(num-1)){
               int curr=num;
               int longeststreak=0;
               while(hashset.contains(num)){
                   longeststreak++;
                   num++;
               }
              ans=Math.max(ans,longeststreak);
           }
       }
       return ans;
    }
}



