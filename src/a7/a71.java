package a7;


import javax.swing.*;

public class a71 {

    public static void main(String[] args) {

        //a)
        boolean zaehlerSet = false;
        boolean nennerSet = false;
        int zaehler = 0;
        int nenner = 0;
        while(!zaehlerSet) {
            try {
                String input = JOptionPane.showInputDialog("Geben Sie den Zaehler des Bruches ein: ");
                zaehler = Integer.parseInt(input);
                zaehlerSet = true;
            }catch (NumberFormatException nfe){
                System.out.println("Ungueltige Eingabe");
            }
        }
        while(!nennerSet) {
            String input = JOptionPane.showInputDialog("Geben Sie den Nenner des Bruches ein: ");
            try {
                nenner = Integer.parseInt(input);
                nennerSet = true;
            }catch (NumberFormatException nfe){
                System.out.println("Ungueltige Eingabe");
            }
        }

        Bruch bruch = new Bruch(zaehler,nenner);

        // b)

        Bruch b2 = new Bruch(bruch);
        b2.add(new Bruch(1,10));

        System.out.println(bruch);
        System.out.println(b2);
        System.out.println(bruch.getNenner() > b2.getNenner());
    }
}
