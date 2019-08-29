package a6;

public class a63 {

    public static void main(String[] args) {
        printCircle(20);
    }

    public static void printCircle(int radius) {
        int middleChoords = radius;
        for (int i = 0; i < 2 * radius + 1; i++) {
            for (int j = 0; j < 2 * radius + 1; j++) {
                String output = "  ";
                if (Math.round(distance(i, j, middleChoords, middleChoords)) == radius) {
                    output = "# ";
                }
                System.out.print(output);
            }
            System.out.printf("%n");
        }
    }

    private static double distance(int pointX, int pointY,
                                   int midX, int midY) {
        return Math.sqrt((midX - pointX) * (midX - pointX)
                + (midY - pointY) * (midY - pointY));
    }
}
