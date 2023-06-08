class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        char [] s1=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        for(int i=0;i<s1.length;i++){
           if(map.containsKey(s1[i])){
            int currval =map.get(s1[i]);
               start=Math.max(currval+1,start);
                map.put(s1[i],i);
           }else{
               map.put(s1[i],i);
               
           }
            int currCount=i-start+1;
            if(maxCount<currCount) maxCount=currCount;
        }
        return maxCount;
        
    }
}