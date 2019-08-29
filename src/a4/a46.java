package a4;

import javax.swing.*;

public class a46 {

    public static void main(String[] args) {
        while(true){
            String input = JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 0 und 127 ein: ");
            try{
                int number = Integer.parseInt(input);
                if(number < 0 || number > 127){
                    System.out.println("Ungueltige Eingabe.");
                }
                if(number == 0){
                    break;
                }
                System.out.println("ASCII-Zeichen Nummer "+number+" ist "+(char) number);
            }catch (NumberFormatException nfe){
                System.out.println("Ungueltige Eingabe");
            }
        }
    }
}
