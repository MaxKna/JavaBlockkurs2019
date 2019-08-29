package a2;

import javax.swing.*;

public class a21 {

    public static void main(String[] args) {
        String result = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");
        try{
            int num = Integer.parseInt(result);
            double rez = 1. / num;
            System.out.println("Zahl: "+num+", Reziproke Zahl: "+rez);
        }catch(NumberFormatException nfe){
            System.out.println("Falsche Eingabe.");
        }
    }
}
