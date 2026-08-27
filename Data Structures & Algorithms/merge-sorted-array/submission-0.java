class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // 4 6 8 0 0 
        // 7 9

        // 4 6 8 0 9
        // 4 6 8 8 9
        // 4 6 7 8 9
        

        int r1 = m - 1;
        int r2 = n - 1;
        int p1 = m + n - 1; //Is the pointer of the end of array

        while(r2 >= 0 ){
            if(r1 >= 0 && nums1[r1] >= nums2[r2]){
                nums1[p1] = nums1[r1];
                r1--; 
            } else { 
                nums1[p1] = nums2[r2];
                r2--;
            }
            p1--;
        }
    }
}