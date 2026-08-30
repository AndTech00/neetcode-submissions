class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0; //Legge tutte l'array
        int r = nums.length - 1;
        int writer = 0; //Indica dove andare a scrivere i numeri !=0

        while(l <= r){
            if(nums[l] != 0){
                int temp = nums[writer]; //Dovrebbe essere sempre a 0 il valore in writer.
                nums[writer] = nums[l];
                nums[l] = temp;

                writer++;
            } 
            l++;
        }

    }
}