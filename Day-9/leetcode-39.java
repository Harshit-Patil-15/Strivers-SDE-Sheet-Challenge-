class Solution {
    public void helper(int idx,int [] arr,int target,List<Integer> temp,List<List<Integer>> ans){
        if(idx==arr.length){
            if(target==0) ans.add(new ArrayList<>(temp));
            return;
        }
        if(target>=arr[idx]) {
            temp.add(arr[idx]);
            helper(idx,arr,target-arr[idx],temp,ans);
            temp.remove(temp.size()-1);
        }
        helper(idx+1,arr,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}