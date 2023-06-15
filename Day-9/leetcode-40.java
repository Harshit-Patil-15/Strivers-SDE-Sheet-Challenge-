class Solution {
    public void helper(int idx,int[] arr,int target,List<Integer> temp ,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i-1]==arr[i]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            helper(i+1,arr,target-arr[i],temp,ans);
            temp.remove(temp.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}