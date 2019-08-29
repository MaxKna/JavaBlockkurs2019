package a4;


import javax.swing.*;

public class a45 {

    public static void main(String[] args) {
        double sum = 0;
        int counter = 0;
        while (true){
            String input = JOptionPane.showInputDialog("Geben Sie einee Zahl ein:");
            try{
                double parsed = Double.parseDouble(input);
                if(parsed == 0){
                    break;
                }
                sum += parsed;
                counter++;
            }catch(NumberFormatException nfe){
                System.out.println("Ungueltige Eingabe.");
            }
        }
        if(counter != 0) {
            System.out.println("Summe der Eingaben: " + sum);
            System.out.println("Durchschnittlicher Wert: " + String.format("%.2f",sum / counter));
        }else{
            System.out.println("Es wurden keine Werte eingegeben.");
        }
    }
}
