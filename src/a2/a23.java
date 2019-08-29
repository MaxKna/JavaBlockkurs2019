package a2;

public class a23 {

    public static void main(String[] args) {
        int[] testValues = {0,30,40};
        for(int val : testValues){
            System.out.println(val +"°C ist "+getFahrenheit(val)+"°F");
        }
    }

    public static double getFahrenheit(double celsius){
        double fahrenheit = celsius * 9./5 + 32;
        return fahrenheit;
    }
}
