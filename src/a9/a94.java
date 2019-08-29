package a9;

public class a94 {

    public static void main(String[] args) {
        System.out.println(reverse("Donaudampfschifffahrtsgesellschaftskapitän"));
    }

    public static String reverse(String s){
        String output = "";
        for(int i = s.length()-1; i>=0; i--){
            output += s.charAt(i);
        }
        return output;
    }
}
