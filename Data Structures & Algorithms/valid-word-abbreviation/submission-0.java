class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int l1 = 0;
        int l2 = 0;

        while(l1 < word.length() && l2 < abbr.length()){
            if(abbr.charAt(l2) == '0')
                    return false;

            if(Character.isDigit(abbr.charAt(l2))){
 
            StringBuilder sb = new StringBuilder();
                while(l2 < abbr.length() && Character.isDigit(abbr.charAt(l2))){
                    sb.append(abbr.charAt(l2));
                    l2++;
                }
                l1 = l1 + Integer.parseInt(sb.toString());
            } else {
            
            if(word.charAt(l1) == abbr.charAt(l2)){
                l1++;
                l2++;
            } else {
                return false;
            }
            }
        }
            return l1 == word.length() && l2 ==(abbr.length());
        }
    }