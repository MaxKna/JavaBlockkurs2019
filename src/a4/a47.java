package a4;

public class a47 {

    public static void main(String[] args) {
        for(int i = 0; i< 11;i++){
            try{
                System.out.println("Fibonacci-Number "+i+" ist "+getFibonacciNumber(i));
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static int getFibonacciNumber(int n){
        if(n < 1){
            throw new ArithmeticException("Ungueltige Stelle der Folge: "+n);
        }
        if(n == 1 || n == 2){
            return 1;
        }else{
            return getFibonacciNumber(n-2)+getFibonacciNumber(n-1);
        }
    }
}
