package Probeklausur;

public class a2 {
    //Soll das größte Element zurückgeben welches in beiden Array vorhanden ist
    public static int getBiggestCommonElement(int[][] a, int[][] b){
        int ret = Integer.MIN_VALUE;
        for (int[] innerA : a){
            for(int innerIntA : innerA){
                if(innerIntA > ret && scanArray(innerIntA, b)){
                    ret = innerIntA;
                }
            }
        }
        return ret;
    }


    private static boolean scanArray(int i, int[][] arr){
        for (int[] innerArr : arr){
           for (int innerI : innerArr){
               if(i == innerI){
                   return true;
               }
           }
        }
        return false;
    }
}
