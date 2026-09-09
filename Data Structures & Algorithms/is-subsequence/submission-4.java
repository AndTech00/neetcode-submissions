class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;

        int j = 0;
        for(int i = 0; i < t.length() - 1; i++){
            if(t.charAt(i) == (s.charAt(j))){
                j++;
                if(j == s.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }
}