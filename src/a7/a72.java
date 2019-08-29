package a7;

public class a72 {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1,3);
        Bruch alias = b1;
        Bruch klon = new Bruch(b1);

        System.out.println("b1 == alias: "+(b1 == alias));
        System.out.println("b1 == klon: "+(b1 == klon));
        System.out.println("alias == klon: "+(alias == klon));

        System.out.println("b1.equals(alias): "+(b1.equals(alias)));
        System.out.println("b1.equals(klon): "+(b1.equals(klon)));
        System.out.println("alias.equals(klon): "+(alias.equals(klon)));
    }
}
