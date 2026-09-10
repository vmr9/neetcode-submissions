class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = 0;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        } else {
            min = Math.min(minStack.peek(), val);
            minStack.push(min);
            stack.push(val);
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
