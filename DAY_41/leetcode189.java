package DAY_41;

public class leetcode189 {
    class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        k = k % nums.length;
        for (int i=0; i<nums.length; i++){
            a[(i + k) % nums.length] = nums[i];
        }
        for (int j=0 ; j < nums.length; j++){
            nums[j] = a [j];
        }
        
    }
}
}
