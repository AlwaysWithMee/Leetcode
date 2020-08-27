package BinarySearch;

// 69. Sqrt(x)
public class Leetcode69 {

    public int mySqrt(int x) {

        long left = 1, right = x;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (mid * mid < x)
                left = mid + 1;
            else
                right = mid;
        }
        if (left * left <= x)
            return (int) left;
        else
            return (int) left - 1;

    }
}
