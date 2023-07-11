class Solution
{
	public int maxSumIS(int nums[], int n)  
	{  
	    int[] dp=new int [nums.length];
        int max=0;
         dp[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i]=nums[i];
         for(int j=0;j<i;j++){
           if(nums[i]>nums[j]){
               dp[i]=Math.max(dp[i],dp[j]+nums[i]);
           }    
        }
        }
        for(int x:dp){
            max=Math.max(max,x);
        }
        return max;
	}  
}