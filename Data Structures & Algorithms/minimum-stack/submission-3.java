class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = 0;
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        } else{
            stack.push(val);
            min = Math.min(val, minStack.peek());
            minStack.push(min);
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
