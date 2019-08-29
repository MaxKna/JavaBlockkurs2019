package a12_a13;

public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+this.x+"|"+this.y+")";
    }

    public static void main(String[] args) {
        Punkt p0 = new Punkt(1,1);
        System.out.println(p0);
        p0.setX(5);
        System.out.println(p0.getX());
        System.out.println(p0);
        p0.setY(-3);
        System.out.println(p0.getY());
        System.out.println(p0);
    }

    //A13

    public Punkt(Punkt p){
        this.x = p.x;
        this.y = p.y;
    }

    public void schiebe(double dx, double dy){
        setX(getX()+dx);
        setY(getY()+dy);
    }
}
