class Solution {
    public int removeDuplicates(int[] nums) {
        int l1 = 0;
        int distinct = 1; // So a priori che c'è almeno 1 elemento

        while(l1 < nums.length - 1){
            if(nums[l1] != nums[l1 +1]){
                nums[distinct] = nums[l1+1];
                distinct++;
            }
            
            l1++;
        }
        return distinct;
    }
}