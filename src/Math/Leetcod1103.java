package Math;

// 1103. Distribute Candies to People
public class Leetcod1103 {

    public int[] distributeCandies(int candies, int num_people) {

        int res [] = new int [num_people];
        int numGiven = 1;
        int index = 0;

        while(candies > 0){

            if(candies > numGiven)
                res[index % num_people] += numGiven;
            else
                res[index % num_people] += candies;

            candies -= numGiven;
            index++;
            numGiven++;

        }
        return res;
    }

}
