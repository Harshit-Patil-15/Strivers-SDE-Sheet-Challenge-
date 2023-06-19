public class Solution {
   
    public static int NthRoot(int n, int m) {
     int low=1;
     int high=m;
     while(low<=high){
         int mid = (low + high) / 2; 
         long x=1;
         for(int i=1;i<=n;i++){
             x=x*mid;
             if(x>1L * m) break;
         }
        if(x==m) return mid;
         if(x<m){
             low=mid+1;
         }else{
            high= mid-1;
         }
     }
     return -1;
    }
}
/*
    Time Complexity: O( N * log(M) )
    Space Complexity: O( 1 )

    Where 'N' and 'M' are given integers.
*/