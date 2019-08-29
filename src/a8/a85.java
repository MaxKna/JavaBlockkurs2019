package a8;

import java.util.Arrays;

public class a85 {

    public static void main(String[] args) {
        int[] first = {1,2,3,4};
        int[] second = {5,6,7,8,9,10};
        System.out.println(Arrays.toString(concat(first,second)));
    }

    public static int[] concat(int[] x1, int[] x2){
        int length = x1.length + x2.length;
        int[] concat = new int[length];
        System.arraycopy(x1,0,concat,0,x1.length);
        System.arraycopy(x2,0,concat,x1.length,x2.length);
        return concat;
    }
}
