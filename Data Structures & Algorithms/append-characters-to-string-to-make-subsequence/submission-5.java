class Solution {
    public int appendCharacters(String s, String t) {
        int sizeT = t.length() - 1;
        int sizeS = s.length() - 1;

        int j = 0;
        int left = sizeT + 1;
        int res = left;

        for(int i = 0; i <= sizeS && left != 0; i++){
            if(s.charAt(i) == t.charAt(j)){
                left--;
                j++;
            } 
        }
        return Math.min(res,left);
        }
    }