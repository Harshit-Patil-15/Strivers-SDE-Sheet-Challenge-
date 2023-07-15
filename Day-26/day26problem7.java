
class Solution{
    public static boolean isPalindrome(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static int helper(int idx,String s,int [] dp)
    {
        if(idx==s.length()) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int mini=Integer.MAX_VALUE;
           for(int i=idx+1;i<=s.length();i++){ 
            if(isPalindrome(idx,i-1,s)){
               int cost=1+helper(i,s,dp);
               mini=Math.min(cost,mini);
            }
        }
        return dp[idx]= mini;
    }
    static int palindromicPartition(String str)
    {
         int [] dp=new int [str.length()];
        Arrays.fill(dp,-1);
       return helper(0,str,dp)-1;
    }
}