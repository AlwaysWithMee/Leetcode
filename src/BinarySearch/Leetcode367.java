package BinarySearch;

// 367. Valid Perfect Square
public class Leetcode367 {

    public boolean isPerfectSquare(int num) {

        if(num == 1)
            return true;

        long low = 1, high = num;
        while(low <= high){

            long mid = (high + low) / 2;

            if(mid * mid == num)
                return true;
            else if(mid * mid > num)
                high = mid-1;
            else
                low = mid+1;
        }

        return false;
    }

}
