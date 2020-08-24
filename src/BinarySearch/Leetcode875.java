package BinarySearch;

import java.util.Arrays;

// 875. Koko Eating Bananas
public class Leetcode875 {

    public int minEatingSpeed(int[] piles, int H) {

        int left = 1, right = 1000000000;

        while(left <= right){

            int mid = left + (right - left) / 2, hours = 0;

            for(int pile : piles)
                hours += (pile + mid - 1) / mid;

            if (hours > H)
                left = mid + 1;
            else if(hours <= H)
                right = mid - 1;
        }
        return left;
    }
}
