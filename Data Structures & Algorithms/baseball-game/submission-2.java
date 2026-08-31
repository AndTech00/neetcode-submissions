class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String operation : operations){
            if(operation.charAt(0) == 'D'){
                stack.push(stack.peek()*2);
                res+=stack.peek();
            }
            else if(operation.charAt(0) == 'C'){
                res-=stack.peek();
                stack.pop();
            }
            else if(operation.charAt(0) == '+'){
                Integer lastOp = stack.pop();
                int sumValue = lastOp + stack.peek();
                stack.push(lastOp);
                stack.push(sumValue);
                res+=sumValue;
            }
            else{
                stack.push(Integer.parseInt(operation));
                res+=stack.peek();
            }
        }
        return res;
    }
}