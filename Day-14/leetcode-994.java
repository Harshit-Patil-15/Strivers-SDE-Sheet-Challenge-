class Solution {
    public int orangesRotting(int[][] grid) {
     Queue<Pair> q=new LinkedList<>();
   int m=grid.length;
   int n=grid[0].length;
    int count_fresh = 0;
    for(int i=0;i<m;i++){
       for(int j=0;j<n;j++){
           if(grid[i][j]==2) q.add(new Pair(i,j));
             if(grid[i][j] != 0) {
                    count_fresh++;
                }
       }
    }

  if(count_fresh == 0) return 0;
        int countMin = 0, cnt = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        
while(!q.isEmpty()){
    int size=q.size();
     cnt += size; 
   for(int i = 0 ; i < size ; i++) {
                Pair t = q.poll();
                for(int j = 0;j<4;j++) {
                    int x = t.idx1 + dx[j];
                    int y = t.idx2 + dy[j];
                    
                    if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || 
                    grid[x][y] == 2) continue;
                    
                    grid[x][y] = 2;
                    q.offer(new Pair(x,y));
                }
            }
            if(q.size() != 0) {
                countMin++;
            }
        }


   return count_fresh == cnt ? countMin : -1;
    }
}
class Pair{
    int idx1;
    int idx2;
    Pair(int idx1,int idx2){
      this.idx1=idx1;
        this.idx2=idx2;
    }
}