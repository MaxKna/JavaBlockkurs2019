package a9;

import java.util.Arrays;

public class a98 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDigitCount(-238948908)));
    }

    public static int[] getDigitCount(int n){
        int[] digits = new int[10];
        String number = n+"";
        for(int i = 0; i< number.length(); i++){
            for(int j = 0; j< 10; j++){
                if(number.charAt(i) == (char) (j+48)){
                    digits[j] = digits[j] +1;
                    break;
                }
            }
        }
        return digits;
    }
}
