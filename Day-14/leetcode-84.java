class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] ls=new int [n];//previous smaller
        int [] rs=new int [n];//nextsamller
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<n){
         while(!stack.isEmpty() &&heights[stack.peek()]>=heights[i]) stack.pop();
         if(stack.isEmpty()) {
         ls[i]=0;
       } else{
            ls[i]=stack.peek()+1;
        }
        stack.push(i);i++;
    }

 while(!stack.isEmpty()) stack.pop();


  i=n-1;
    while(i>=0){
         while(!stack.isEmpty() &&heights[stack.peek()]>=heights[i]) stack.pop();
         if(stack.isEmpty()) {
         rs[i]=n-1;
        }else{
            rs[i]=stack.peek()-1;
        }
        stack.push(i);i--;
    }

int maxArea=0;
for(int j=0;j<n;j++){
int currArea=heights[j]*(rs[j]-ls[j]+1);
maxArea=Math.max(currArea,maxArea);
}

return maxArea;
}
}