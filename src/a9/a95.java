package a9;

public class a95 {

    public static void main(String[] args) {
        System.out.println(clozeText("Mein Name ist Max und das hier wird ein toller Text."));
    }

    public static String clozeText(String s){
        String output = "";
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if(i%4 == 3){
                c = ' ';
            }
            output += c;
        }
        return output;
    }
}
