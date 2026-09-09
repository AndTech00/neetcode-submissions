class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for(String elem : strs){
            if(i == elem.length() || elem.charAt(i) != strs[0].charAt(i)){
                return elem.substring(0,i);
            }
        }
        }
        return strs[0];
    }
}