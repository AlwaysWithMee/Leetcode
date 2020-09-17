package BinarySearch;

// 154. Find Minimum in Rotated Sorted Array II
public class Leetcode154 {

    public int findMin(int[] nums) {

        int min = Integer.MAX_VALUE;
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < min)
                min = nums[mid];

            if (nums[mid] <= nums[left] && nums[mid] <= nums[right]) {
                left++;
                right--;
            } else if (nums[mid] <= nums[right])
                right = mid - 1;
            else
                left = mid + 1;

        }

        return min;

    }
}
