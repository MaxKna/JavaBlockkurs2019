package a4;

public class a43 {

    public static void main(String[] args) {
        for(int i = 0; i< 20; i++){
            try{
                System.out.println("Berechnung von Pi mit "+i+" Reihengliedern: "+getPi(i));
            }catch(ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static double getPi(int n){
        if(n<1){
            throw new ArithmeticException("Ungueltige Anzahl der Reihenglieder: "+n);
        }
        int nenner = 1;
        boolean plus = true;
        double sum = 0;
        for(int i = 0; i< n; i++){
            double glied = 1./nenner;
            if(plus){
                sum = sum + glied;
            }else{
                sum = sum - glied;
            }
            nenner += 2;
            plus = !plus;
        }
        return 4*sum;
    }
}
