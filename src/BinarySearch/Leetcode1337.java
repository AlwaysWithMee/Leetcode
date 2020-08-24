package BinarySearch;

//1337. The K Weakest Rows in a Matrix
public class Leetcode1337 {

    public int[] kWeakestRows(int[][] mat, int k) {

        int row = mat.length, col = mat[0].length;
        int [] mark = new int[row];
        int [] sorted = new int[row];
        int [] res = new int [k];
        int n = row - 1, j = col - 1;

        while(j >= 0){

            for(int i = row - 1; i >= 0; --i){

                if(mat[i][j] == 1 && mark[i] != 1){

                    sorted[n] = i;
                    mark[i] = 1;
                    n--;
                }
            }
            j--;
        }

        for(int i = row - 1; i >= 0; --i){

            if(mark[i] != 1){
                sorted[n] = i;
                n--;
            }
        }

        for(int i = 0; i < k; i++)
            res[i] = sorted[i];

        return res;
    }
}
