class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeat=(b.length())/(a.length());
        repeat+=2;
        int count=1;
        String str1=a;
        for (int i=1;i<=repeat;i++){
            if(str1.contains(b)){
                return count;
            }else{
                str1+=a;
                count++;
            }
        }
        return -1;

    }
}