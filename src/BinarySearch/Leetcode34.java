package BinarySearch;

// 34. Find First and Last Position of Element in Sorted Array
public class Leetcode34 {

    public int[] searchRange(int[] nums, int target) {

        int res [] = new int [2];
        int left = 0, right = nums.length;

        if(nums.length == 0){
            res[0] = -1;
            res[1] = -1;
            return res;
        }

        // Find the left boundary
        while(left < right){

            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                right = mid;
            }
            else if(nums[mid] > target){
                right = mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
        }

        if(left == nums.length || nums[left] != target){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        else
            res[0] = left;

        left = 0;
        right = nums.length;

        // Find the right boundary
        while(left < right){

            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid;
            }
        }
        res[1] = left - 1;
        return res;
    }
}
