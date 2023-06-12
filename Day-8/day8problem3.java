class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
       Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
       int maxi=0;
       for(Job x:arr){
          maxi= Math.max(maxi,x.deadline);
       }
       
      int result[] = new int[maxi + 1];
      
      int countJobs = 0, jobProfit = 0;

      for (int i = 0; i < n; i++) {

         for (int j = arr[i].deadline; j > 0; j--) {
         if(result[j]==0){
             result[j]=arr[i].id;
             countJobs++;
             jobProfit+=arr[i].profit;
             break;
         }
       
         }
      }
      return new int[]{countJobs,jobProfit};
       
    }
}