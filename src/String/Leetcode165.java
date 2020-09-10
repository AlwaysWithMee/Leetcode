package String;

// 165. Compare Version Numbers
public class Leetcode165 {

    public int compareVersion(String version1, String version2) {

        String [] arr1 = version1.split("\\.");
        String [] arr2 = version2.split("\\.");

        int maxLen = Math.max(arr1.length, arr2.length);

        for(int i = 0; i < maxLen; ++i){
            int curr1 = (i >= arr1.length) ? 0 : Integer.parseInt(arr1[i]);
            int curr2 = (i >= arr2.length) ? 0 : Integer.parseInt(arr2[i]);

            if(curr1 > curr2)
                return 1;
            else if (curr1 < curr2)
                return -1;
        }

        return 0;
    }

}
