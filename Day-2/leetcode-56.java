class Solution {
    public int[][] merge(int[][] intervals) {
    ArrayList<int[]> ans=new ArrayList<>();
    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
 
   for(int i=0;i<intervals.length;i++){
       int si=intervals[i][0];
       int ei=intervals[i][1];
       int j=i+1;
       for(;j<intervals.length;j++){
           if(ei>=intervals[j][0]){
               ei=Math.max(ei,intervals[j][1]);
           }else{
               break;
           } 
       }
      i=j-1;
       ans.add(new int[]{si,ei});
   }    
        int m = ans.size();
        return ans.toArray(new int[m][2]);
    }
}

