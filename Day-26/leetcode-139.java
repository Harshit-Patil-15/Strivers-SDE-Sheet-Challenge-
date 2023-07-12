class Solution {
    public static int helper(int idx,String s, HashSet<String> hs,int [] dp){
        if(idx==s.length()) return 1;
        if(dp[idx]!=-1) return dp[idx];
        for(int i=idx+1;i<=s.length();i++){ 
            if(hs.contains(s.substring(idx,i))){
               if( helper(i,s,hs,dp)==1) return  1;
            }
        }
        return dp[idx]=0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs=new HashSet<>();
        for(String x:wordDict){
            hs.add(x);
        }
        int [] dp=new int [s.length()];
        Arrays.fill(dp,-1);
        int ans= helper(0,s,hs,dp);
        return ans==1?true:false;
    }
