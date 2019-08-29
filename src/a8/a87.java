package a8;

public class a87 {


    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(getTrace(matrix));
    }

    public static double getTrace(double[][] matrix){
        double sum = 0;
        int counter = 0;
        try {
            while (true) {
                sum += matrix[counter][counter];
                counter++;
            }
        }catch(ArrayIndexOutOfBoundsException ignored){

        }
        return sum;
    }
}
