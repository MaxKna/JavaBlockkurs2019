package a8;

public class a84 {

    public static void main(String[] args) {
        for(int i = 0; i< 15; i++){
            try{
                System.out.println("Monat "+i+" ist "+getNameOfMonth(i));
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }
    }

    public static String getNameOfMonth(int nr){
        if(nr <= 0 || nr > 12){
            throw new ArithmeticException("Ungueltige Monatsnummer: "+nr);
        }
        String[] monthNames = {"Januar","Februar","Maerz","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
        return monthNames[nr-1];
    }
}
