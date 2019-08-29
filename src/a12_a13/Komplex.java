package a12_a13;

import java.util.Locale;

public class Komplex {

    private double real;
    private double imag;

    public Komplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real+String.format(Locale.US,"%+.2f",imag)+"i";
    }

    public static void main(String[] args) {
        Komplex komplex = new Komplex(3,5);
        System.out.println(komplex);
    }


    //A13

    public Komplex(Komplex k){
        this.real = k.real;
        this.imag = k.imag;
    }

    public double getBetrag(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public void konjugiertKomplex(){
        this.imag = -imag;
    }

    public Komplex getKonjugiertKomplex(){
        Komplex komplex = new Komplex(this);
        komplex.konjugiertKomplex();
        return komplex;
    }

    public void add(Komplex k){
        this.real += k.real;
        this.imag += k.imag;
    }

    public void mult(Komplex k){
        this.real = this.real * k.real - this.imag * k.imag;
        this.imag = this.real * k.imag + this.imag * k.real;
    }


}
