package striver.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle118 {




    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> pascalTriangle= new ArrayList<>();

        for (int i=0;i<=n;i+=1){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j+=1){
                if (j==0 || j==i){
                    row.add(1); // simply add them without pos
                }

                else{
                    int val = pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
                    row.add(val);
                }

            }
            pascalTriangle.add(row);
        }

//        for (var row: pascalTriangle){
//            for (var ele: row){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

        return pascalTriangle;
    }



    public static void main(String[] args) {
        pascalTriangle(13);
    }
}
