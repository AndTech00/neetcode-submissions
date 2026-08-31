class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for(String operation : operations){
            if(operation.charAt(0) == 'D'){
                stack.push(String.valueOf(Integer.parseInt(stack.peek())*2));
            }
            else if(operation.charAt(0) == 'C'){
                stack.pop();
            }
            else if(operation.charAt(0) == '+'){
                String lastOp = stack.peek();
                stack.pop();
                int val = Integer.parseInt(lastOp) + Integer.parseInt(stack.peek());
                stack.push(lastOp);
                stack.push(String.valueOf(val));
            }
            else{
                stack.push(operation);
            }
        }
        int res = 0;
        while(stack.size() > 0){
            res+= Integer.parseInt(stack.peek());
            stack.pop();
        }
        return res;
    }
}