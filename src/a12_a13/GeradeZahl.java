package a12_a13;

public class GeradeZahl {

    private int zahl;

    public GeradeZahl(int zahl) {
        setZahl(zahl);
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        if(Math.abs(zahl) % 2 == 1){
            this.zahl = zahl -1;
        }else{
            this.zahl = zahl;
        }

    }

    @Override
    public String toString() {
        return this.zahl+"";
    }

    public static void main(String[] args) {
        GeradeZahl gz = new GeradeZahl(-15);
        System.out.println(gz);
    }


    //A13


    public GeradeZahl(GeradeZahl gz){
        this.zahl = gz.zahl;
    }

    public GeradeZahl getNachfolger(){
        return new GeradeZahl(this.zahl+2);
    }

    public GeradeZahl getSum(GeradeZahl g2){
        return new GeradeZahl(this.zahl+g2.zahl);
    }

    public GeradeZahl getProd(GeradeZahl g2){
        return new GeradeZahl(this.zahl*g2.zahl);
    }
}
