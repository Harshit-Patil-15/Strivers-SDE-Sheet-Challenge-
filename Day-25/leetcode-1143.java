class Solution {

    public int f(String t1, String t2,int i,int j,int [][] dp){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j]=1+f(t1,t2,i-1,j-1,dp);
        }
        return dp[i][j]= Math.max(f(t1,t2,i-1,j,dp),f(t1,t2,i,j-1,dp));
    }
    public int lcsTabular(String text1, String text2,int [][] dp){
          for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[0].length;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else 
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
    public int longestCommonSubsequence(String text1, String text2) {
       
        int n=text1.length();
         int m=text2.length();
          int [][] dp =new int [n+1][m+1];
        //  for(int[] rows:dp){
        //      Arrays.fill(rows,-1);
        //  }
        //  return f(text1,text2,n-1,m-1,dp);
        return lcsTabular(text1,text2,dp);
    }
}




















