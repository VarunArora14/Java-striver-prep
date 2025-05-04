package extras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckValidRotations {

    private int rotations = Integer.MAX_VALUE;

    private boolean checkValidRotations(int value, int[] tops, int[] bottoms){
        int n = tops.length;
        for (int i=0;i<tops.length;i+=1){
            if (tops[i] != value && bottoms[i] != value) {
                return false;
            }

        }

        int topRotations = (int) Arrays.stream(tops).filter(x -> x!=value).count();
        int bottomRotations = (int) Arrays.stream(bottoms).filter(x -> x!=value).count();
        System.out.println("top rotations: " + topRotations + " bottom rotations: " + bottomRotations);

        rotations = Math.min(topRotations, Math.min(rotations, bottomRotations));
        return true;
    }

    public int minDominoRotations(int[] tops, int[] bottoms){
        int n = tops.length;

        Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();


//        Implement counter in java to count occurrences
        for (int ele: tops){
            mapper.put(ele, mapper.getOrDefault(ele, 0)+1);
        }

        for (int ele: bottoms){
            mapper.put(ele, mapper.getOrDefault(ele, 0)+1);
        }


        mapper.forEach((k,v) -> {
            checkValidRotations(k, tops, bottoms);


        });

        if (rotations<1e5){
            return rotations;
        }
        return -1;

    }

    public static void main(String[] args) {

        CheckValidRotations checkValidRotations = new CheckValidRotations();
        int[] tops  = {2,1,2,4,2,2};
        int[] bottoms = {5,2,6,2,3,2};
        System.out.println(checkValidRotations.minDominoRotations(tops, bottoms));

    }
}
