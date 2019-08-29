package a7;

import java.awt.*;
import java.util.Scanner;

public class a75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die die x-Koordinate von Punkt 1 ein: ");
        String input = sc.nextLine();
        int x1 = Integer.parseInt(input);
        System.out.print("Geben Sie die die y-Koordinate von Punkt 1 ein: ");
        input = sc.nextLine();
        int y1 = Integer.parseInt(input);
        System.out.print("Geben Sie die die x-Koordinate von Punkt 2 ein: ");
        input = sc.nextLine();
        int x2 = Integer.parseInt(input);
        System.out.print("Geben Sie die die y-Koordinate von Punkt 2 ein: ");
        input = sc.nextLine();
        int y2 = Integer.parseInt(input);

        Point eins = new Point(x1,y1);
        Point zwei = new Point(x2,y2);

        eins.translate(10,10);
        zwei.translate(10,10);

        System.out.println("("+eins.getX()+"|"+eins.getY()+")");
        System.out.println("("+zwei.getX()+"|"+zwei.getY()+")");

        System.out.println(eins.distance(zwei));

    }
}
