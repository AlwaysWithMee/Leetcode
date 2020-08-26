package BinarySearch;

// 1482. Minimum Number of Days to Make m Bouquets
public class Leetcode1482 {

    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers to make Bouquets
        if (m * k > bloomDay.length)
            return -1;

        // Left  = minimum day for flower to bloom
        // Right = maximum day for flower to bloom
        int left = 1, right = 0;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        // Binary search to optimize answer
        while (left <= right) {

            int mid = left + (right - left) / 2, total = 0, curr = 0;

            for (int day : bloomDay) {

                // Flower has bloomed
                if (mid >= day) {
                    curr++;

                    // Its possible to make a Bouquet
                    if (curr == k) {
                        curr = 0;
                        total++;
                    }
                } else
                    curr = 0;
            }

            if (total >= m)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
