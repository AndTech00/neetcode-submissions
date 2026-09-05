class Solution {
    public int lengthOfLastWord(String s) {
        boolean isNewLetter = true;
        String currentWord = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if(isNewLetter){
                    currentWord = "";
                    isNewLetter = false;
                }
                currentWord += s.charAt(i);
            }
            else if(s.charAt(i) == ' '){
                isNewLetter = true;
            }
        }
        return currentWord.length();
    }
}