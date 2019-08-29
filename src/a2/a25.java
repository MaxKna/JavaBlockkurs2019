package a2;

public class a25 {

    public static void main(String[] args) {
        System.out.println("Zufaellige double:\t"+getDoubleRandom(13,37));
        System.out.println("Zufaelliger integer:\t"+getIntRandom(2,8));
    }

    public static double getDoubleRandom(double min, double max){
        double random = Math.random()*(max-min) + min;
        return random;
    }

    public static int getIntRandom(int min, int max){
        int random = (int) (Math.random()*(max-min) + min);
        return random;
    }
}
