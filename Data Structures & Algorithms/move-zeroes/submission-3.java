class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0; //Legge tutte l'array
        int writer = 0; //Indica dove andare a scrivere i numeri !=0

        while(l <= nums.length - 1){
            if(nums[l] != 0){
                int temp = nums[writer]; 
                nums[writer] = nums[l];
                nums[l] = temp;

                writer++;
            } 
            l++;
        }

    }
}