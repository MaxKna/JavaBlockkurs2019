package a9;

public class a97 {

    public static void main(String[] args) {
        System.out.println(newGermanOrthography("Schlagabtausch"));
    }

    public static String newGermanOrthography(String s) {
        String output = "";
        int counter = 0;
        while (counter < s.length()) {
            char front = s.charAt(counter);
            try {
                if ((front == 'S' || front == 's') && s.charAt(counter + 1) == 'c' && s.charAt(counter + 2) == 'h') {
                    output += front + "h";
                    counter = counter + 3;
                } else {
                    output += front;
                    counter++;
                }
            }catch(IndexOutOfBoundsException ioobe){
                output += front;
                counter++;
            }
        }
        return output;
    }
}
