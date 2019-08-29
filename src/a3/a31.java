package a3;

public class a31 {

    public static void main(String[] args) {
        int[] testVals = {-15,8,17,33,100,Integer.MAX_VALUE};
        for(int val : testVals){
            System.out.println("Temperatur "+val+"°C ist "+getTemperatureText(val)+".");
        }
    }

    public static String getTemperatureText(double temp){
        if(temp <= 10){
            return "kalt";
        }else if(temp <= 25){
            return "lauwarm";
        }else if(temp <= 40){
            return "warum";
        }else{
            return "heiss";
        }
    }
}
