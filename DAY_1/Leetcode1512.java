/* leetcode problem number 1512
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
         int  cout =0;
    for (int i=0; i<nums.length; i++){
        for ( int j=i+1; j<nums.length; j++){
            if (nums[i] == nums[j]){
            

                     cout +=1;
            
            }
        }
    }
    return cout;
    }
}
