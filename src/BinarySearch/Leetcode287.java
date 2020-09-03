package BinarySearch;

// 287. Find the Duplicate Number
public class Leetcode287 {

    // Binary search
    public int findDuplicate(int[] nums) {

        int left = 0, right = nums.length;

        while (left < right){

            int mid = left + (right - left) / 2, count = 0;

            for (int n : nums)
                if (n <= mid)
                    count++;

            if (count <= mid)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
}
