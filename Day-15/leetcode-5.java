class Solution {
    int st=0,end=0;
     int max_len = 1;
    public void helper(String s,int l,int r){
            while(l >= 0 && r < s.length()){
                if(s.charAt(l) == s.charAt(r)){
                    l--; r++;
                }else
                    break;
            }
            int len = r-l-1;
            if(len > max_len){
                max_len = len;
                st = l+1;
                end = r-1;
            }
    }
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
       
        int n = s.length();
    
        for(int i = 0; i < n-1; i++){
        helper(s,i,i);//for odd palin
        helper(s,i,i+1);//for even palin
        }
 
        return s.substring(st, end + 1);
    }
}