class Solution {
    public int romanToInt(String s) {
        // Constraints.
        if (s == null) return -1;
        
        int size = s.length();
        
        // Defining the symbols.
        HashMap<Character,Integer> romanSymbols = new HashMap<>();
        romanSymbols.put('I', 1);
        romanSymbols.put('V', 5);
        romanSymbols.put('X', 10);
        romanSymbols.put('L', 50);
        romanSymbols.put('C', 100);
        romanSymbols.put('D', 500);
        romanSymbols.put('M', 1000);
        
        int prevValue = 0;
        int sum = 0;
        
    
        for (int i = size - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            
            if (romanSymbols.containsKey(currentChar)) {
                int currentValue = romanSymbols.get(currentChar);
          
                if (currentValue < prevValue)
                    sum -= currentValue;
                else
                    sum += currentValue;
                
                prevValue = currentValue;
            }
        }
        return sum;
    }
}