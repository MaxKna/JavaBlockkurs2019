package Probeklausur;

/*
schreibe eine Klasse Text mit Folgenden Methoden
 */
public class Text {

    private String text;

    //erstellt ein Textobjekt aus übergebenen String
    public Text(String s){
        this.setText(s);
    }

    //erstellt ein Textobjekt aus übergebenen Text
    public Text(Text t){
        this.setText(t.getText());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //gib den char an Stelle i zurück bei neg. Zahlen von hinten
    public char getCharAt(int i){
        if(i < 0){
            return this.text.charAt(this.text.length()+i);
        }
        return this.text.charAt(i);
    }

    //Zählt wie oft c in text vorkommt
    public int getCount(char c){
        int counter = 0;
        for (int i = 0; i<this.text.length(); i++){
            if(this.text.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }
}
