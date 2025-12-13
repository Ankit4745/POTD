package DAY_13;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int Srow =0;
        int Scol =0;
        int Erow = matrix.length-1;
        int Ecol = matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();

        while (Srow <= Erow && Scol <= Ecol){
            // top
            for ( int j = Scol; j<=Ecol; j++){
                list.add(matrix[Srow][j]);
              

            }
            // rigth 
            for (int i=Srow+1; i<= Erow; i++){
                list.add(matrix[i][Ecol]);
          
            }
            // bottom
            for ( int j = Ecol-1; j>= Scol; j--){
                if (Srow == Erow){
                    break;
                }
                list.add(matrix[Erow][j]);
            }
       
            // left 
            for ( int i=Erow-1; i>= Srow+1; i--){
                if (Scol == Ecol){
                    break;
                }
                list.add(matrix[i][Scol]);
            }


             Scol++;
             Srow++;
             Ecol--;
             Erow--;

         
        }
     return list;   
    }

}
}
