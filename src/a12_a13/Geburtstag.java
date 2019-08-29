package a12_a13;

public class Geburtstag {

    private static final int[] numberOfDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    private int day;
    private int month;

    public Geburtstag(int day, int month) {
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0 && day <= numberOfDays[this.month-1]){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Ungueltiger Wert fuer Tag: "+day);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month < 13){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Ungueltiger Wert fuer Monat: "+month);
        }
    }

    @Override
    public String toString() {
        return day+"."+month+".";
    }

    public static void main(String[] args) {
        Geburtstag geb = new Geburtstag(0,14);
        System.out.println(geb);
    }

    //A13

    public Geburtstag(Geburtstag g){
        this.day = g.day;
        this.month = g.month;
    }

    public boolean equals(Geburtstag g2){
        return (this.day == g2.day) && (this.month == g2.month);
    }
}
