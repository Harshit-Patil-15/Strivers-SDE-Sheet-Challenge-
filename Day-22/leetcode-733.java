class Solution {
    public void helper(int[][] image, int i, int j, int color,int pc) {
        if(i>=image.length ||i<0 ||j>=image[0].length ||j<0 ) return;
        if(image[i][j]!=pc) return;
        image[i][j]=color;
         helper(image,i+1,j,color,pc);
         helper(image,i,j+1,color,pc);
         helper(image,i-1,j,color,pc);
         helper(image,i,j-1,color,pc);
         return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pc=image[sr][sc];
        if(pc == color){
            return image;
        }
        helper(image,sr,sc,color,pc);
       return image;
    }
}