package a9;

import java.util.Arrays;
import java.util.Scanner;

public class a96 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getParamenters()));
    }

    public static int[] getParamenters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Paramterzeile ein.");
        String input = sc.nextLine();
        String[] split = input.split(",");
        int errorCount = 0;
        int[] ints = new int[split.length];
        for(int i = 0; i< split.length; i++){
            try{
                int value = Integer.parseInt(split[i].trim());
                ints[i-errorCount] = value;
            }catch(NumberFormatException nfe){
                errorCount++;
            }
        }
        if(errorCount > 0){
            int[] errorFree = new int[ints.length-errorCount];
            System.arraycopy(ints,0,errorFree,0,errorFree.length);
            return errorFree;
        }
        return ints;
    }
}
