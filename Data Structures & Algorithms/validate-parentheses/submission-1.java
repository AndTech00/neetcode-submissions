class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for(Character str : s.toCharArray()){
            switch(str){
                case ')':
                    if(stack.size() == 0 || stack.pop() != '('){
                        return false;
                    } else {
                        break;
                    }
                case ']':
                    if(stack.size() == 0 || stack.pop() != '['){
                        return false;
                    } else {
                        break;
                    }
                case '}':
                    if(stack.size() == 0 || stack.pop() != '{'){
                        return false;
                    } else {
                        break;
                    }
                default:
                    stack.push(str);
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    
    }
}
