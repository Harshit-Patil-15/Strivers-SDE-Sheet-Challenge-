class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalArea=0;
        int leftmax=0;
        int rightmax=0;
        int start=0;
        int end=n-1;
        while(start<end){
            if(height[start]<=height[end]){
                if(height[start]>leftmax){
                    leftmax=height[start];
                    }else{
                    totalArea+=leftmax-height[start];
                    start++;
                }
            }else{
                 if(height[end]>rightmax){
                   rightmax=height[end];
                    }else{
                    totalArea+=rightmax-height[end];
                     end--;
                }
            }
            }
        return totalArea;
    }
}




