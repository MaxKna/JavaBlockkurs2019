package a11;

import java.math.BigInteger;
import java.util.Scanner;

public class a113 {

    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("1");
        printBigInt();
    }

    public static void printBigInt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        String input = sc.nextLine();
        try {
            BigInteger inputNumber = new BigInteger(input);
            BigInteger faculty = new BigInteger("1");
            while (!inputNumber.equals(new BigInteger("1"))) {
                faculty = faculty.multiply(inputNumber);
                inputNumber = inputNumber.subtract(new BigInteger("1"));
            }
            System.out.println(faculty);
        }catch(NumberFormatException nfe){
            System.out.println("Ungueltige Eingabe.");
        }
    }

}
