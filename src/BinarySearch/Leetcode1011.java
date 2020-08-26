package BinarySearch;

// 1011. Capacity To Ship Packages Within D Days
public class Leetcode1011 {

    public int shipWithinDays(int[] weights, int D) {

        int left = 0, right = 0;

        for(int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while(left <= right){

            int mid = left + (right - left) / 2, total = 0;
            int capacity = mid;
            for(int i = 0; i < weights.length; ++i){

                if(mid < weights[i]){
                    total = D;
                    break;
                }
                if (capacity >= weights[i])
                    capacity -= weights[i];
                else {
                    capacity = mid;
                    total++;
                    capacity -= weights[i];
                }
            }
            total++;

            if(total > D)
                left = mid + 1;
            else if(total <= D)
                right = mid - 1;
        }
        return left;
    }
}
