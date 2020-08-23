package BinarySearch;

// 167. Two Sum II - Input array is sorted
public class Leetcode167 {

    // 2 pointer
    public int[] twoSum(int[] numbers, int target) {

        int [] res = new int[2];
        int start = 0, end = numbers.length - 1;
        int sum = numbers[start] + numbers[end];

        while(sum != target){

            if(sum > target)
                end--;
            else
                start++;

            sum = numbers[start] + numbers[end];
        }
        res[0] = ++start;
        res[1] = ++end;
        return res;
    }
}
