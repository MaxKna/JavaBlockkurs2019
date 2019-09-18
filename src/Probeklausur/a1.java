package Probeklausur;

import javax.swing.*;

public class a1 {
    // 1. Wie lautet die Kopfzeile der main-Methode?
    //     public static void main(String[] args)

    //2.Codezeile um einen char in String umzuwandeln
    char c = 'a';
    String s = "" + c;

    //3. Liteale zu Wert und Typ
    /*
        WERT    |         TYP       |       Literal
        5                 int
        5                 double
        w                 String
        w                 char
     */
    int i = 5;
    double d = 5.0;
    String s1 = "w";
    char c1 = 'w';

    //4. Welcher Code wird beim Erzeugen eines Objekts aufgerufen?
    // Konstruktor / Constructor

    //5. Unterschieed zischen den letzten beiden Zeilen Code
    int[] x = {1, 2, 3, 4, 5};
    int[] y = x;            //Alias / Referenz
    int[] z = x.clone();   //Klon

    //Was gibt Funktion 'funktionX' aus
    public static int[] funktionX(int z) {
        int[] ret = new int[5];
        ret[0] = z;
        for (int i = 0; i < ret.length; i++) {
            ret[i] = ret[i - 1] + 1;
        }
        return ret;
    }
    //ArrayIndexOutOfBoundsException

    //Befehl um String in int zu parsen
    //Integer.parseInt(s);

    //Ergänze das Wort
    //Das SChlüsselwort private steht in der Regel vor den _____ einer Klasee
    // Namen / Attributen

    // Werte der Ausdrücke
    //1+2+"a"; // 3a
    //1+2+'a'  // 50

    //Rückgabewert der angebeben wird wenn kein Wert zurückgegeben wird
    //  void

    // Fehlersuche
    public static void k() {
        for (int i = 0; i < 10; i++) {
                System.out.println(i);
        }
        System.out.println(i); // i ist nicht definiert
    }

    // Endlosschleife Wie???

    public static void i(){
        for(;;){
            break;
        }
        while(true){
            break;
        }
    }

    //Aussagen vervollständigen
    public static boolean isSmallLetter(char c){
        c = JOptionPane.showInputDialog("Buchastabe eingeben: ");
        if(c>='a' && c<='z'){
            return true;
        }else{
            return false;
        }
    }
    //Syntaxfehler?
    //JoptionPane lifert String kein cahr

    //Unsinnig, weil....
    //keiner Umlaute erkannt werden

    //Umlaute werden nicht erkannt weil....
    //diese nicht zwischen a und z in der ACCII Tabelle zufinden sind


}
