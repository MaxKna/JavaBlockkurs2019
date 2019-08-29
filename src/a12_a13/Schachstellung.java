package a12_a13;

public class Schachstellung {

    private static final char[] legalLetters = {'b', 'B', 'k', 'K', 'd', 'D', 't', 'T', 's', 'S', 'l', 'L'};

    private char[][] stellung;

    public Schachstellung() {
        stellung = new char[8][8];

    }

    public void setzeSchachstellung(String s) {
        stellung = new char[8][8];

        if (s.length() % 3 != 0) {
            System.out.println("Ungueltige Eingabe.");
            return;
        }
        String[] parts = s.split("(?<=\\G.{3})");
        for (String part : parts) {
            try {
                boolean charIsLegal = false;
                char c = part.charAt(0);
                for (char legalChar : legalLetters) {
                    if (c == legalChar) {
                        charIsLegal = true;
                        break;
                    }
                }
                if (!charIsLegal) {
                    throw new IllegalArgumentException("Ungueltiger Buchstabe: "+c);
                }
                int x = Integer.parseInt(part.charAt(1) + "");
                if(x < 1 || x > 8){
                    throw new IllegalArgumentException("Ungueltige x-Koordinate: "+x);
                }
                int y = Integer.parseInt(part.charAt(2) + "");
                if(y < 1 || y > 8){
                    throw new IllegalArgumentException("Ungueltige y-Koordinate: "+y);
                }
                if(stellung[x-1][y-1] != '\u0000'){
                    throw new IllegalArgumentException("Feld schon besetzt: "+x+"|"+y);
                }
                stellung[x - 1][y - 1] = c;
            } catch (NumberFormatException ignored) {

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String border = "+---+---+---+---+---+---+---+---+\n";
        String pre = "|";
        for (int i = 0; i < stellung.length; i++) {
            sb.append(border);
            for (int j = 0; j < stellung[i].length; j++) {
                char toPrint = stellung[i][j];
                if (toPrint == '\u0000') {
                    toPrint = ' ';
                }
                sb.append(pre).append(" ").append(toPrint).append(" ");
            }
            sb.append(pre).append("\n");
        }
        sb.append(border);
        return sb.toString();
    }

    public static void main(String[] args) {
        Schachstellung s = new Schachstellung();
        s.setzeSchachstellung("b22K24l28B23k66");
        System.out.println(s);
    }
}
