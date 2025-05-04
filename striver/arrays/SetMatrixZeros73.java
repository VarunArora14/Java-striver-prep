package striver.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros73 {

    public static ArrayList<ArrayList<Integer>> setZeros(ArrayList<ArrayList<Integer>> matrix){
        int n = matrix.size();
        int m = matrix.getFirst().size();

        int [] rows = new int[n];
        int [] cols = new int[m];

        for (int i=0;i<n;i+=1){
            for (int j=0;j<m;j+=1){
                if (matrix.get(i).get(j) == 0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }

        for (int i=0;i<n;i+=1){
            for (int j=0;j<m;j+=1){
                if (rows[i]==1 || rows[j]==1){
                    matrix.get(i).set(j, 0);
                }
            }
        }


        return matrix;




    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        ArrayList<ArrayList<Integer>> ans = setZeros(matrix);

        for(var e: matrix){
            for (var j:e){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
