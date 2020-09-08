package HashTable;

import java.util.HashMap;

public class Leetcode290 {

    public boolean wordPattern(String pattern, String str) {

        String[] arr = str.split(" ");

        if (pattern.length() == 0 || str.length() == 0 || pattern.length() != arr.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); ++i) {

            char curr = pattern.charAt(i);

            // If the string exist in the map
            if (map.containsValue(arr[i]))
                if (map.containsKey(curr) == false || !map.get(curr).equals(arr[i]))
                    return false;
                else
                    continue;

            if (!map.containsKey(curr))
                map.put(curr, arr[i]);
            else if (!map.get(curr).equals(arr[i]))
                return false;

        }
        return true;
    }

}
