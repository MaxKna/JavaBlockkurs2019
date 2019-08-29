package a2;

public class a24 {

    public static void main(String[] args) {
        System.out.println(getDistance(0,0,4,3));
    }

    public static double getDistance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        return distance;
    }
}
