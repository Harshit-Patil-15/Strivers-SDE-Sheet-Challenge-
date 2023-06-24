class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack =new ArrayDeque<>();
        int n=s.length();
        char peek;
        // if(n%2==1) return false;
        int i=0;
        while(i<s.length()){
            char currChar=s.charAt(i);
           if(currChar=='{' ||currChar=='[' || currChar=='('){
               stack.push(currChar);
               i++;
               continue;
           }
            if(currChar == ')' || currChar == '}' || currChar == ']') {
				if(stack.isEmpty()) return false;
			}
                 peek=stack.peek();
            
           
            switch (currChar){
                case '}':
                    if('{' !=peek) return false;
                    stack.pop();
                break;
                    case ']':
                     if('[' !=peek) return false;
                    stack.pop();
                break;
                    case ')':
                     if('(' !=peek) return false;
                    stack.pop();
                break;     
            }
            i++;
        }
        return stack.isEmpty();
    }
}