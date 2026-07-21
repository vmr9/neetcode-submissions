class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<>();
        for(String op : operations){
            if(op.equals("+")){
                int sum = stack.get(stack.size()-1) + stack.get(stack.size()-2);
                stack.add(sum);
            } else if(op.equals("D")){
                stack.add(2*stack.get(stack.size()-1));
            } else if(op.equals("C")){
                stack.remove(stack.size()-1);
            } else {
                stack.add(Integer.parseInt(op));
            }
        }
        int totalSum = 0;
        for (int score : stack){
            totalSum += score;
        }
        return totalSum;
    }
}