package a8;

import java.util.Arrays;

public class a86 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getIndexSumArray(5,5)));
    }

    public static int[][] getIndexSumArray(int a, int b){
        int[][] array = new int[a][b];
        for(int i = 0; i< array.length;i++){
            for(int j= 0; j<array[i].length;j++){
                array[i][j] = i+j+1;
            }
        }
        return array;
    }
}
