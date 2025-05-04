package extras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumEquivDominoPairsSolution {

    public int numEquivDominoPairs(int[][] dominoes){
        Map<List<Integer>, Integer> counter = new HashMap<>();
        int res=0;
        for (int[] d: dominoes){
            int f = Math.min(d[0], d[1]);
            int s = Math.max(d[0], d[1]);

            counter.put(Arrays.asList(f,s), counter.getOrDefault(Arrays.asList(f,s), 0)+1);
        }
        System.out.println(counter);
        for (var entry: counter.entrySet()){
            int v = entry.getValue();
            if (v>=2){
                res+=(int) (v*(v-1))/2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] dominoes = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        NumEquivDominoPairsSolution solution = new NumEquivDominoPairsSolution();
        System.out.println(solution.numEquivDominoPairs(dominoes));

    }
}
