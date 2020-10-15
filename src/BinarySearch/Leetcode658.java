package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Leetcode658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<>();

        // Find the target index
        int left = 0, right = arr.length - 1, mid = 0;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if(arr[mid] == x)
                break;
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;

        }

        // Target is smaller than the array
        if(right < 0){

            for(int i = 0; i < k; ++i)
                res.add(arr[i]);

        }

        // Target is larger than the array
        else if (left == arr.length){
            for(int i = arr.length - k; i < arr.length; ++i)
                res.add(arr[i]);
        }

        else {

            if ((mid + 1) - k >= 0)
                for(int i = (mid + 1) - k; i < mid + 1; ++i)
                    res.add(arr[i]);

            else
                for(int i = 0; i < k; ++i)
                    res.add(arr[i]);

        }
        return res;
    }
}
