package Array;

public class Leetcode905 {

    // Extra space
    public int[] sortArrayByParity(int[] A) {

        int [] res = new int[A.length];
        int start = 0, end = A.length - 1;

        for(int i = 0; i < A.length; ++i){

            if(A[i] % 2 == 0){
                res[start] = A[i];
                start++;
            }
            else{
                res[end] = A[i];
                end--;
            }
        }
        return res;
    }

    // Inplace swapping
    public int[] sortArrayByParity2(int[] A) {

        for(int i = 0, j = 0; j < A.length; ++j){

            if(A[j] % 2 == 0){

                int temp = A[i];
                A[i++] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}
