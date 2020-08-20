package String;

import java.util.HashMap;

// 824. Goat Latin
public class Leetcode824 {

    public static String toGoatLatin(String S) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        map.put('A', 0);
        map.put('E', 0);
        map.put('I', 0);
        map.put('O', 0);
        map.put('U', 0);

        String[] array = S.split(" ");
        String endString = "a";

        for (int i = 0; i < array.length; ++i) {

            String newString;

            if (map.containsKey(array[i].charAt(0)))
                newString = new String(array[i] + "ma" + endString);

            else
                newString = new String(array[i].substring(1) + array[i].charAt(0) + "ma" + endString);

            array[i] = newString;
            endString += "a";
        }

        return String.join(" ", array);
    }
}