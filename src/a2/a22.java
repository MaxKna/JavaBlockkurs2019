package a2;

import javax.swing.*;

public class a22 {

    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
        try{
            double d = Double.parseDouble(in);
            System.out.println("Absolutwert:\t"+Math.abs(d));
            System.out.println("Logarithmus:\t" +Math.log(d));
            System.out.println("Sinh:\t\t\t"+ Math.sinh(d));
        }catch(NumberFormatException nfe){
            System.out.println("Falsche Eingabe");
        }
    }
}
