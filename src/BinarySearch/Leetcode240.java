package BinarySearch;

// 240. Search a 2D Matrix II
public class Leetcode240 {

    // Binary search
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

        int left = 0, right = matrix.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

            if (matrix[mid][0] <= target)
                left = mid + 1;
            else if (matrix[mid][0] > target)
                right = mid - 1;
        }

        if (right < 0)
            return false;

        int index = right;

        for(int r = 0; r <= index; ++r){

            left = 0;
            right = matrix[0].length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;
                if (matrix[r][mid] == target)
                    return true;
                else if (matrix[r][mid] < target)
                    left = mid + 1;
                else if (matrix[r][mid] > target)
                    right = mid - 1;
            }
        }

        return false;
    }

    // Top down search
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

        // Initialize to be on the top right
        int currRow = 0, currCol = matrix[0].length - 1;

        while(currRow <= matrix.length - 1 && currCol >= 0){

            int currVal = matrix[currRow][currCol];

            if(currVal == target)
                return true;
            else if (currVal < target)
                currRow++;
            else if (currVal > target)
                currCol--;

        }

        return false;
    }
}
