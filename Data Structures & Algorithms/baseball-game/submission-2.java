class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String ops: operations){
            if(ops.equals("+")){
                int top = stack.pop();
                int sum = stack.peek() + top;
                stack.push(top);
                stack.push(sum);
                res += sum;
            } else if(ops.equals("D")){
                stack.push(2*stack.peek());
                res += stack.peek();
            } else if(ops.equals("C")){
                res -= stack.pop();
            } else {
                stack.push(Integer.parseInt(ops));
                res += stack.peek();
            }
        }
        return res;
    }
}