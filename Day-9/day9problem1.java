//User function Template for Java//User function Template for Java
class Solution{
    
    public static void helper(ArrayList<Integer> arr,int idx,int sum,int n,ArrayList<Integer> ans){
        if(idx==n) {
            ans.add(sum);
            return;
        }
        helper(arr,idx+1,sum+arr.get(idx),n,ans);
        helper(arr,idx+1,sum,n,ans);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<>();
      helper(arr,0,0,N,ans);
      Collections.sort(ans);
      return ans;
    }
}