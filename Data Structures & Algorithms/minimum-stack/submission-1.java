class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if (!minStack.isEmpty() && minStack.peek() < val) {
            minStack.push(minStack.peek());
        } else {
            minStack.push(val);
        }
        mainStack.push(val);
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
