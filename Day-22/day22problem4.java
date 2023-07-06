public class Solution {
    public int[] dNums(int[] A, int b) {
        int [] ans =new int[A.length-b+1];
        int idx=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<b;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        ans[idx++]=hm.size();
        
        for(int i=b;i<A.length;i++){
           int  prev=A[i-b];
            if(hm.get(prev)>1){
               hm.put(prev,hm.get(prev)-1);
            }else{
                 hm.remove(prev);
            }
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
             ans[idx++]=hm.size();
            
        }
        return ans;
    }
}