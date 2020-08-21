package BinarySearch;

// 441. Arranging Coins
public class Leetcode441 {

    public int arrangeCoins(int n) {

        long low = 0, high = n;
        long mid = 0;

        while(low <= high){

            mid = (low + high) / 2;
            long curr = mid * (mid + 1) / 2;

            if(curr == n)
                return (int)mid;
            else if(curr < n)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return (int)high;

    }
}
