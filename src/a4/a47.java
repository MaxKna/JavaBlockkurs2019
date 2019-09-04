package a4;

public class a47 {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            try {
                System.out.println("Fibonacci-Number (recursive) " + i + " ist " + getFibonacciNumber(i) + "\n");
                System.out.println("Fibonacci-Number (iterative) " + i + " ist " + getFibonacciNumberIter(i) + "\n");
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        }
    }

    public static int getFibonacciNumber(int n) {
        if (n < 1) {
            throw new ArithmeticException("Ungueltige Stelle der Folge: " + n);
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
        }
    }

    public static int getFibonacciNumberIter(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int erg = 0;
        int fibVorletzte = 0;
        int fibLetzte = 1;
        for (int i = 0; i < n; i++) {
            erg = fibLetzte + fibVorletzte;
            if (i % 2 == 0) {
                fibLetzte = erg;
            } else {
                fibVorletzte = erg;
            }
        }
        return erg;
    }
}
