package DAY_50;

public class leetcode74 {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean  a = false ;
        for (int row=0; row < matrix.length; row++){
            for(int col=0; col <matrix[row].length; col++ ){
                if(matrix[row][col] == target){
                    a = true;
                    return a;

                }
          }
             
       }
       return a; 
    }
}
}
