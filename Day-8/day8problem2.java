class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
           Arrays.sort(arr); 
        Arrays.sort(dep); 
        int i=1;
        int j=0;
        int platform=1;
        int result=1;
       
        while(i<n &&j<n){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
               
            }else{
                platform--;
                j++;
            }
           result=Math.max(result,platform);
        
         
        }
        return result;
        
    }
    
}