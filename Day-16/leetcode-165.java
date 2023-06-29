
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");

        int l1=v1.length;
        int l2=v2.length;
       int i=0,j=0;
        while(i<l1 &&j<l2){
            int val1=Integer.parseInt(v1[i]);
            int val2=Integer.parseInt(v2[j]);
            i++;j++;

            if(val1>val2){
                return 1;
            }else if(val1<val2){
                return -1;
            }

        }

           while(i<l1){
            int val1=Integer.parseInt(v1[i]);
            i++;
            if(val1>0){
                return 1;
            }
            }

            while(j<l2){
            int val2=Integer.parseInt(v2[j]);
            j++;
            if(val2>0){
                return -1;
            }
            }
            return 0;

        }


    }
