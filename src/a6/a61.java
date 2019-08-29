package a6;

import a2.a25;

public class a61 {

    public static void main(String[] args) {
        for(int i = 0; i< 10; i++){
            int a = a25.getIntRandom(100,10000);
            int b = a25.getIntRandom(100,10000);
            System.out.println("GCD von "+a+" und "+ b+" ist "+gcd(a,b));
        }
    }

    public static int gcd(int a, int b){
        if (a < 1 || b < 1){
            throw new ArithmeticException("Ein Uebergabeparameter ist kleiner als 1");
        }
        while(b != 0){
            if( a > b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
}
