class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i=num1.length-1;
        while(n>0 && m>0){
            if(num1[m-1]>num2[n-1]){
                num1[i]=num1[m-1];
                m--;i--;
            }else{
               num1[i]=num2[n-1];
                n--;i--;
            }
        }

        if(n-1>=0){
        while(n>0){
             num1[i]=num2[n-1];
                n--;i--;
        }
    }
}
}

