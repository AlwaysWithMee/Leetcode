package BinarySearch;

// 1283. Find the Smallest Divisor Given a Threshold
public class Leetcode1283 {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1, right = 10000000;

        while (left < right) {

            int mid = left + (right - left) / 2, sum = 0;

            for(int n : nums)
                sum += (n + mid - 1) / mid;

            if (sum > threshold)
                left = mid + 1;
            else
                right = mid;
        }

        return left;

    }
}
