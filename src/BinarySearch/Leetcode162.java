package BinarySearch;

// 162. Find Peak Element
public class Leetcode162 {

    public int findPeakElement(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int rightBound = mid + 1;

            if (rightBound < nums.length && nums[rightBound] > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return left;
    }
}
