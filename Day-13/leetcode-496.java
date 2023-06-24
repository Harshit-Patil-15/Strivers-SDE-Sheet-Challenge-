class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] num2) {
            Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=num2.length-1;i>=0;i--){
            while(!stack.isEmpty() &&stack.peek()<num2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(num2[i],-1);      
            }else{
                   map.put(num2[i],stack.peek());           
            }
             stack.push(num2[i]);
            
        }
        for (int i = 0; i < nums1.length; i++)  nums1[i] = map.get(nums1[i]);
        return nums1;
    
        
    }
}