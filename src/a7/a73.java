package a7;

import java.util.Random;

public class a73 {

    public static void main(String[] args) {

        //a)
        Random random = new Random();

        //b)
        for(int i = 0; i< 100; i++){
            System.out.println(random.nextInt(101));
        }
    }
}
