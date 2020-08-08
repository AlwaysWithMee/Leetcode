package Array;

// 1470. Shuffle the Array
public class Leetcode1470 {

    // Brutal force O(n)
    public int[] shuffle(int[] nums, int n) {

        int j = 0;
        int res[] = new int[2*n];

        for(int i = 0; i < n; ++i){

            res[j] = nums[i];
            res[j+1] = nums[i+n];
            j += 2;
        }

        return res;
    }
}
