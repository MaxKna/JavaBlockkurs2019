package Probeklausur;

public class a4 {
    public static double werteAus(double d1, char c1, double d2, char c2, double d3) {
        double erg = 0.;
        switch (c1) {
            case '*':
                erg += d1 * d2;
                break;
            case '/':
                erg += d1 / d2;
                break;
            case '+':
                switch (c2) {
                    case '+':
                        erg += d1 + d2 + d3;
                        break;
                    case '-':
                        erg += d1 + d2 - d3;
                    case '*':
                        erg += d1 + (d2 * d3);
                        break;
                    case '/':
                        erg += d1 + (d2 / d3);
                    default:
                        throw new ArithmeticException("Fehler");
                }
                break;

            case '-':
                switch (c2) {
                    case '+':
                        erg += d1 - d2 + d3;
                        break;
                    case '-':
                        erg += d1 - d2 - d3;
                        break;
                    case '*':
                        erg += d1 - (d2 * d3);
                        break;
                    case '/':
                        erg += d1 - (d2 / d3);
                    default:
                        throw new ArithmeticException("Fehler");
                }
                break;

        }
        return erg;
    }

    public static void main(String[] args) {
        System.out.println(werteAus(-1.,'+', 2., '*', 3.));
    }
}
