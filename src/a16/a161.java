package a16;

import java.util.Arrays;

public class a161 {

    public static void main(String[] args) {
        double[] testVals = {1.1, 4.04, 3.1337, 42.0, 0.9};
        selectionSort(testVals);
        System.out.println(Arrays.toString(testVals));
    }

    public static void selectionSort(double[] x) {
        for (int i = 0; i < x.length; i++) {
            int max = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] > x[max]) {
                    max = j;
                }
            }
            double help = x[max];
            x[max] = x[i];
            x[i] = help;
        }
    }
}
