package HashTable;

import java.util.HashSet;
import java.util.Set;

// 771. Jewels and Stones
public class Leetcode771 {

    public int numJewelsInStones(String jewels, String stones) {

        int res = 0;
        Set setJ = new HashSet();

        for(char j : jewels.toCharArray())
            setJ.add(j);
        for(char s : stones.toCharArray())
            if(setJ.contains(s))
                res++;

        return res;

    }
}
