package BinarySearch;

// 74. Search a 2D Matrix
public class Leetcode74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

        // Search at which row this number will be located
        int left = 0, right = matrix.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Found the number
            if (target == matrix[mid][0])
                return true;
            else if (target < matrix[mid][0])
                right = mid - 1;
            else if (target > matrix[mid][0])
                left = mid + 1;

        }

        // Target is less than the smallest number in the matrix
        if(right < 0)
            return false;

        // Right will be the row index to search the target
        int row = right;
        left = 0;
        right = matrix[row].length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target == matrix[row][mid])
                return true;
            else if (target < matrix[row][mid])
                right = mid - 1;
            else if (target > matrix[row][mid])
                left = mid + 1;
        }
        return false;
    }

}
