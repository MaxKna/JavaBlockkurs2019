package a4;

public class a44 {

    public static void main(String[] args) {
        int[] testVals = {2,81,5000,-3};
        for(int val : testVals){
            try{
                System.out.println("Naechste Partialsumme von "+val+" ist "+getNextPartialSum(val)+".");
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static int getNextPartialSum(int v){
        if(v < 1){
            throw new ArithmeticException("Ungueltiger Wert fuer Grenze: "+v);
        }
        int sum = 0;
        int counter = 1;
        while(sum < v){
            sum += counter++;
        }
        return sum;
    }
}
