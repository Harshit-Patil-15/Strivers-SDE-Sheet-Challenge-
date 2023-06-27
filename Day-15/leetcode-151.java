class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        int j=s.length();
        String ans="";
         while(i>=0){
           while(i>=0 && s.charAt(i)==' ') {
               i--;
           }
           j=i;
           if(i<0) break;//this to handle whether the last substring is empty or not
            while(i>=0 && s.charAt(i)!=' ') {
               i--;
           }
           
           if(ans==""){
               ans=ans.concat(s.substring(i+1,j+1));
           }else{
               ans=ans.concat(" "+s.substring(i+1,j+1));

           }

        
         }
         return ans;
    }
}