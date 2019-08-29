package a3;

public class a33 {

    public static void main(String[] args) {
        test(0,0);
        test(0,15);
        test(15,0);
        test(2,3);
        test(2,-8);
    }

    private static void test(double a, double b){
        String result;
        try{
            double res = solveLinearEquation(a,b);
            result = res + "";
        }catch (ArithmeticException ae){
            result = ae.getMessage();
        }
        System.out.println("Versuche "+a+"*x+"+b+"=0 zu loesen. Ergebnis: "+result);
    }

    public static double solveLinearEquation(double a, double b){
        if(a == 0){
            if(b != 0){
                throw new ArithmeticException("Gleichung nicht loesbar!");
            }else{
                throw new ArithmeticException("Gleichung hat unendlich viele Loesungen!");
            }
        }else{
            return -b/a + 0.0; // Addition von 0.0 umgeht das Ergebnis von -0.0
        }
    }
}
