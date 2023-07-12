class Solution {
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        for(int x:cuts) arr.add(x);
        arr.add(n);
        Collections.sort(arr);
        int c=arr.size()-2;
        int [][] dp=new int [c+2][c+2];
       for(int l=c;l>=1;l--){
           for(int r=1;r<=c;r++){
                if(l>r) continue;
     int mini=Integer.MAX_VALUE;
    
     for(int i=l;i<=r;i++){
         int cost=arr.get(r+1)-arr.get(l-1)+dp[l][i-1]+dp[i+1][r];
         mini=Math.min(mini,cost);
     }
             dp[l][r]=mini;
           }
       }
        return dp[1][c];
    }
}