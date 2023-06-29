class Solution {
    public int strStr(String haystack, String needle) {
    int m=haystack.length();
      for(int i=0;i<=m-needle.length();i++){
          int idx1=i;
          int idx2=0;
      while(idx2<needle.length()){
          if(haystack.charAt(idx1)==needle.charAt(idx2)){
              idx1++;
              idx2++;
          }else{
              break;
          }
          if(idx2==needle.length()) return i;
      }
      }
        return -1;
}
}
// tc-m*n sc=1