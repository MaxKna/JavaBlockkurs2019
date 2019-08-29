package a3;

public class a35 {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            try {
                System.out.println("Monat " + i + " ist " + getNameOfMonth(i));
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        }
    }

    public static String getNameOfMonth(int nr) {
        switch (nr) {
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "Maerz";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
            default:
                throw new ArithmeticException("Ungueltige Nummer fuer Monat: " + nr);
        }
    }
}
