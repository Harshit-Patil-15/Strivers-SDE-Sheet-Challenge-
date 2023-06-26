class MinStack {
     Stack<Long> s=new Stack<>();
     Long min;
    public MinStack() {
        min=Long.MAX_VALUE;
    }
    
    public void push(int value) {
              Long val = Long.valueOf(value);
        if(s.isEmpty()){
            s.push(val);
            min=val;
        }else{
            if(val<min){
                s.push(2*val-min);
                min=val;
            }else{
                s.push(val);
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty()) return;
        long val=s.pop();
        if(val<min){
            min=2*min-val;
        }
    }
    
    public int top() {
          Long val = s.peek();
        if (val < min) {
            return min.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}
