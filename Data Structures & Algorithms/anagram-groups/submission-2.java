class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] repetition = new int[26];
            for(int i = 0; i < str.length(); i++){
                repetition[str.charAt(i) - 'a']++;
            }
            //Potrei pensare di riordinare (soluzione leetcode) però la
            //complessità aumentare.. (esempio):
            //har[] chars = str.toCharArray();
            //Arrays.sort(chars);
            //quello che posso fare è estrapolare
            //dall'array di int una firma stringa con:
            String key = Arrays.toString(repetition);

            if(map.containsKey(key)){
                List<String> currentStrings = map.get(key);
                currentStrings.add(str);
                map.put(key, currentStrings);
            } else {
                map.put(key, new ArrayList<>(List.of(str)));
            }
        }

        List<List<String>> res = new ArrayList<>();

        for(String key : map.keySet()){
            res.add(new ArrayList<>(map.get(key)));
        }
        return res;
    }
}
