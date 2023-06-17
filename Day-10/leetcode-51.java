class Solution {
      private List<String> build(char arr[][]){
        List<String> val = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            val.add(new String(arr[i]));
        return val;
    }
    public boolean isSafe(int n, char [][] arr,int rows,int cols){
        for(int i=0;i<rows;i++){
            if(arr[i][cols]=='Q') return false;
        }
         for(int i=rows-1,j=cols-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q') return false;
        }
         for(int i=rows-1,j=cols+1;i>=0 && j<n;i--,j++){
            if(arr[i][j]=='Q') return false;
        }
        return true;
    }
     public void nQueens(int n,List<List<String>> li, char[][] arr,int rows) {
      if(rows==n) {
       li.add(build(arr));
       return;
      }
       for(int cols=0;cols<n;cols++)
        {
         if(isSafe(n,arr,rows,cols)){
          arr[rows][cols]='Q';
          nQueens(n,li,arr,rows+1);
          arr[rows][cols]='.';  
      }
        }
       return;
    }
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> li= new ArrayList<List<String>>();
      char [][] arr=new char [n][n];
     
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              arr[i][j]='.';
          }
      }
       nQueens(n,li,arr,0) ;
      return li;
    }
}
