class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
            
        int[] conteggio = new int[26];

        for(int i = 0; i < s.length(); i++){
            conteggio[s.charAt(i) - 'a']++;
            conteggio[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < conteggio.length; i++){
            if(conteggio[i] != 0)
                return false;
        }
        return true;
    } 
}