
        class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        long result = 0;
        while (i < s.length() && s.charAt(i) == ' ') //Skip the Spaces
        {
            i++;
        }
        //The Sign of the Number is calculated
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i)=='-')
                sign=-1;
            else
                sign=1;
            i++;
        }
        //Now We find the Number
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
        

            result = result * 10 + digit;
            if(sign==-1 && (result*-1 <= Integer.MIN_VALUE)) return Integer.MIN_VALUE;
                if(sign==1 && (result >= Integer.MAX_VALUE)) return Integer.MAX_VALUE;
                
            
            i++;
        }
        return (int)(result * sign);
    }
}