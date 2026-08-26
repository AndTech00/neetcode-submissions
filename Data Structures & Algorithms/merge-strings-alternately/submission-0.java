class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = 0;
        int l2 = 0;
        int s1 = word1.length();
        int s2 = word2.length();

        StringBuilder sb = new StringBuilder();
        while(l1 < s1 && l2 < s2){
            sb.append(word1.charAt(l1));
            sb.append(word2.charAt(l2));

            l1++;
            l2++;
        }
        if(l1 < s1){
            while(l1 < s1){
                sb.append(word1.charAt(l1));
                l1++;
            }
        }else if(l2 < s2){
            while(l2 < s2){
                sb.append(word2.charAt(l2));
                l2++;
            }
        }
        return sb.toString();
    }
}