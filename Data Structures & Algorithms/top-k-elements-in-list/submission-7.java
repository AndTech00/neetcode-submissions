class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1); 
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer>[] bucket = new List[nums.length + 1];

        for(Integer key : map.keySet()){
            if(bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList<>();
            }
            bucket[map.get(key)].add(key);
            }

            int j = 0;
        for(int i = bucket.length - 1; i > 0 && k != 0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                res[j++] = num;
                k--;
                if(k == 0)
                    return res;
                }
            }
        }
        return res;
        }
        }