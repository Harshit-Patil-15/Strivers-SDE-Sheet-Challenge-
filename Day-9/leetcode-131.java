class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(0,s,temp,res);
        return res;
    }
    public static void helper(int idx,String s, List<String> temp,List<List<String>> res){
        if(idx==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(idx,i,s)){
                temp.add(s.substring(idx,i+1));
                helper(i+1,s,temp,res);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
    public static Boolean isPalindrome(int start,int end ,String s){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}











