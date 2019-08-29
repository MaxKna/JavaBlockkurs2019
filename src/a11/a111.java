package a11;

public class a111 {

    public static void main(String[] args) {
        printPi(5);
    }

    public static void printPi(int decimals){
        System.out.printf("%."+decimals+"f",Math.PI);
    }
}
