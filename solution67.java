
import java.util.*;
public class solution67 {

        public int[][] generateMatrix(int n) {
            int[][] mat = new int[n][n];
            int minRow = 0;
            int minCol = 0;
            int maxRow = mat.length-1;
            int maxCol = mat[0].length-1;
            int cnt = 0;
            int tvr = n*n;
            int val = 1;
            while(cnt < tvr){

                // top Wall...
                for(int row = minRow, col = minCol; col <= maxCol && cnt < tvr ; col++){
                    mat[row][col] = val++;
                    cnt++;

                }
                minRow++;
                // right Wall...

                for(int row = minRow, col = maxCol; row <= maxRow && cnt < tvr ; row++){
                    mat[row][col] = val++;
                    cnt++;
                }
                maxCol--;

                // bottom Wall...

                for(int row = maxRow, col = maxCol; col >= minCol && cnt < tvr; col--){
                    mat[row][col] = val++;
                    cnt++;
                }
                maxRow--;

                // left Wall..

                for(int row = maxRow, col = minCol; row >= minRow && cnt < tvr; row--){
                    mat[row][col] = val++;
                    cnt++;
                }
                minCol++;

            }
            return mat;
        }

    public static void main(String[] args) {
        solution67 s67=new solution67();
        System.out.println(Arrays.deepToString(s67.generateMatrix(3)));
    }
    }