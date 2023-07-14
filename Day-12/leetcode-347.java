class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for (int i=0;i<n;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
     for(Map.Entry<Integer, Integer> it:map.entrySet()){
         pq.offer(it);
         if(pq.size()>k) pq.poll();
     }
     int [] ans=new int [k];
     for(int i=0;i<k;i++){
         ans[i]=pq.poll().getKey();
     }
return ans;
    }
} 
