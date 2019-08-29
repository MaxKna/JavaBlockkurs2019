package a3;

import a2.a25;

public class a32 {

    public static void main(String[] args) {
        int[] testVals = {-3,0,17,33,45,59,75};
        for(int val : testVals){
            try {
                int hour = a25.getIntRandom(4,22);
                System.out.println("Wir haben "+String.format("%02d",hour)+":" + String.format("%02d", val) + " Uhr. Der naechste Bus kommt in " + getWaitingTime(hour, val) + " Minute(n).");
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }

    public static int getWaitingTime(int h, int min){
        if(min < 0 || min > 60){
            throw new IllegalArgumentException("Ungueltiger Wert fuer Minuten: "+min);
        }
        if(min == 0){
            return 0;
        }else if (min <= 30){
            return 30-min;
        }else{
            return 60-min;
        }
    }
}
