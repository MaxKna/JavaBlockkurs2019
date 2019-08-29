package a15;

import a12_a13.Punkt;
import a2.a24;

public class Kreis {

    private double radius;
    private Punkt mittelpunkt;

    public Kreis(double radius, Punkt mittelpunkt) {
        this.radius = radius;
        this.mittelpunkt = mittelpunkt;
    }

    public Kreis(Kreis k2){
        this.radius = k2.radius;
        this.mittelpunkt = new Punkt(k2.mittelpunkt);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Punkt getMittelpunkt() {
        return mittelpunkt;
    }

    public void setMittelpunkt(Punkt mittelpunkt) {
        this.mittelpunkt = mittelpunkt;
    }

    public double getFlaeche(){
        return Math.PI * radius * radius;
    }

    public double getUmfang(){
        return Math.PI * 2 * radius;
    }

    public double getAbstand(Punkt p){
        double distanceToMid = a24.getDistance(p.getX(),mittelpunkt.getX(),p.getY(),mittelpunkt.getY());
        return distanceToMid < radius ? radius-distanceToMid : distanceToMid-radius;
    }
}
