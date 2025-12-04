/* Leetcode problem number 1979
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 4/12/2025  */

class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
            if (nums[i] > max){
                max = nums[i];
            }

        }
         int GCD = 1;
        for (int i=1; i<=min; i++){
            if ((max % i == 0) && (min % i == 0) ){
                GCD = i;
            }
        }
       return GCD; 
    }
}