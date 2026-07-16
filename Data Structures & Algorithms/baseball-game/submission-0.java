class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int totalSum=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int sum=stack.get(stack.size()-1)+stack.get(stack.size()-2);
                stack.add(sum);
            }else if (operations[i].equals("C")){
                stack.remove(stack.size()-1);
            } else if(operations[i].equals("D")){
                int num=stack.get(stack.size()-1);
                stack.add(2*num);
            } else {
                stack.add(Integer.parseInt(operations[i]));
            }
        }
        for(int j=0; j<stack.size(); j++){
            totalSum+=stack.get(j);
        }
        return totalSum;
    }
}