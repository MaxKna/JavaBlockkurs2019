package a3;

public class a34 {

    public static void main(String[] args) {
        int[] testVals = {1513,17358,20130};
        for(int val : testVals){
            System.out.println("Eine Bestellung im Wert von "+ String.format("%.2f",val/100.)+"€ erzeugt "+String.format("%.2f",getPostage(val)/100.)+"€ zusaetzliche Kosten");
        }
    }

    public static int getPostage(int order){
        if(order < 0){
            throw new IllegalArgumentException("Negative price is not possible");
        }
        if(order < 10000){
            return 550;
        }else if(order < 20000){
            return 300;
        }else{
            return 0;
        }
    }
}
