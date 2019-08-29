package a8;

import java.util.Arrays;

public class a81 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getDoubleArray(3,2)));
    }

    public static double[][] getDoubleArray(int x, int y){
        return new double[y][x];
    }
}
