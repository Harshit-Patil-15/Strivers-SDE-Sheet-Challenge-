class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp=new int [s1.length()+1][s2.length()+1];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return helper(s1,s2,s1.length(),s2.length(),dp);
    }
     public int helper(String s1, String s2,int i,int j,int[][]dp) {
        if(i==0) return j;
        if(j==0) return i;
        if (dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)){
         return dp[i][j]= helper(s1,s2,i-1,j-1,dp);
        }else{
        return dp[i][j]= 1+Math.min(helper(s1,s2,i,j-1,dp),Math.min(helper(s1,s2,i-1,j,dp),helper(s1,s2,i-1,j-1,dp)));
        }
    }

}
