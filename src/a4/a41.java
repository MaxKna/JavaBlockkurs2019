package a4;

public class a41 {

    public static void main(String[] args) {
        for(int i = 0; i< 20; i++){
            try{
                System.out.println("Fakultaet von "+i+" ist "+getFactorial(i)+".");
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static int getFactorial(int x){
        if(x < 1){
            throw new ArithmeticException("Fakultaet von Zahl kleiner eins (hier) nicht moeglich");
        }
        int fakultaet = 1;
        for(int i = 1; i<= x; i++){
            fakultaet = fakultaet * i;
        }
        return fakultaet;
    }
}
