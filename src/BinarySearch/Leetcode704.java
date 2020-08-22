package BinarySearch;

// 704. Binary Search
public class Leetcode704 {

    public int search(int[] nums, int target) {

        long low = 0, high = nums.length;

        while(low <= high){

            long mid = (low + high) / 2;

            if(mid >= nums.length)
                return -1;

            if(nums[(int)mid] == target)
                return (int)mid;
            else if(nums[(int)mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

}
