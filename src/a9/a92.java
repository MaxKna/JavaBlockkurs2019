package a9;

import java.util.Scanner;

public class a92 {

    public static void main(String[] args) {
        System.out.println(getCaptialString());
    }

    public static String getCaptialString(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        for(int i = 0; i< input.length(); i++){
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char) (c-32);
            }
            output += c;
        }
        return output;
    }
}
