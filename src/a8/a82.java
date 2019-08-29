package a8;

public class a82 {

    public static void main(String[] args) {
        double[] testVals = {3.2, 5.8, 1.0, -25.3, 17, 99.99};
        System.out.println(getMinimum(testVals));
        System.out.println(getMinimumIndex(testVals));
    }

    public static double getMinimum(double[] a){
        double min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static int getMinimumIndex(double[] a){
        double min = a[0];
        int minIndex = 0;
        for(int i = 0; i< a.length;i++){
            if(a[i] < min){
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
