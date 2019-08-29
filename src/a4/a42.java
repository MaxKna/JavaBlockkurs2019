package a4;

public class a42 {

    public static void main(String[] args) {
        for(int i = 0; i< 25; i++){
            try{
                System.out.println("Die Wahrscheinlichkeit fuer zwei Leute mit dem gleichen Geburtstag betraegt bei "+i+" Gaesten "+String.format("%.2f",doubleBirthday(i)*100));
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static double doubleBirthday(int size){
        if(size < 1){
            throw new ArithmeticException("Geburtstage ohne Personen sind traurig :(");
        }
        double gegWkeit = 1;
        for(int i = 1; i<=size; i++){
            gegWkeit = gegWkeit * (365-i+1)/365.;
        }
        return 1-gegWkeit;
    }
}
