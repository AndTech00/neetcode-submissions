class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = new String();
        int i = 0;
        Character current = null;

        while(true){
        for(String elem : strs){
            if(elem.length() <= i)
                return res;
            if(current == null){
                current = elem.charAt(i);
            } else if(elem.charAt(i) != current){
                return res;
            }
        }
        res+=strs[0].charAt(i++);
        current = null;
            
    }
    }
    }