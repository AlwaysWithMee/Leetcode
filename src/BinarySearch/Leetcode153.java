package BinarySearch;

// 153. Find Minimum in Rotated Sorted Array
public class Leetcode153 {

    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < min)
                min = nums[mid];

            if (nums[right] < nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return min;
    }
}
