package a11;

import java.util.Arrays;

public class a112 {

    public static void main(String[] args) {
        int[][] testArray = {{1,20,332},{30,298,209},{4,2,9}};
        printArray(testArray);
    }

    public static void printArray(int[][] arr){
        int[] sizes = new int[arr.length];
        for(int i = 0; i< arr.length;i++){
            int max = 0;
            for(int j = 0; j< arr[i].length; j++){
                String number = arr[i][j]+"";
                int length = number.length();
                if(length > max){
                    max = length;
                }
            }
            sizes[i] = max;
        }

        System.out.println(Arrays.toString(sizes));

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(String.format("%"+sizes[j]+"s",arr[j][i])+" ");
            }
            System.out.println();
        }
    }
}
