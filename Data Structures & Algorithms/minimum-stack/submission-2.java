class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = 0;
    }
    
    public void push(int val) {
        if(this.minStack.isEmpty()){
            min = val;
            stack.push(val);
            minStack.push(val);
        } else {
            stack.push(val);
            min = Math.min(minStack.peek(), val);
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
