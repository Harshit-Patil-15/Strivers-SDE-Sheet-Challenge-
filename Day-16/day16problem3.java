public class Solution {

    public int solve(String A) {
        int n=A.length();
        int i=0;
        int j=n-1;
        int last=n-1;
        int add=0;
          while(i<=j){
            if(A.charAt(i)==A.charAt(j)){
                i++;j--;
            }else{
                i=0;
                last--;
                j=last;
            }
        }
        add=n-1-last;
        return add;
    }
}
