package BinarySearch;

// 35. Search Insert Position
public class Leetcode35 {

    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0)
            return 0;

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;

        }

        if (right < 0)
            return 0;
        else
            return right+1;

    }
}
