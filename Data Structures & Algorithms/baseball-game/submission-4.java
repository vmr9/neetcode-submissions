class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int total = 0;
        
        for(String op: operations) {
            if(op.equals("+")){
                int top = stack.pop();
                sum = stack.peek() + top;
                stack.push(top);
                stack.push(sum);
                total += sum;
            } else if(op.equals("D")){
                stack.push(2*stack.peek());
                total += stack.peek();
            } else if(op.equals("C")){
                total -= stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
                total += Integer.parseInt(op);
            }
        }
        return total;
    }
}