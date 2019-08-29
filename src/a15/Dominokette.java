package a15;

import a12_a13.Dominostein;

import java.util.LinkedList;

public class Dominokette {

    private LinkedList<Dominostein> steine;

    public Dominokette(Dominostein start) {
        steine = new LinkedList<>();
        steine.add(start);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Dominostein d : steine){
            sb.append(d.toString());
        }
        return sb.toString();
    }

    public void fuegeRechtsAn(Dominostein d){
        int right = steine.get(steine.size()-1).getRight();
        if(d.getLeft() != right){
            d.dreheUm();
        }
        if(d.getLeft() == right){
            steine.addLast(d);
        }else{
            throw new NumberFormatException("Dominostein passt nicht");
        }
    }

    public void fuegeLinksAn(Dominostein d){
        int left = steine.get(0).getLeft();
        if(d.getRight() != left){
            d.dreheUm();
        }
        if(d.getRight() == left){
            steine.addFirst(d);
        }else{
            throw new NumberFormatException("Dominostein passt nicht");
        }
    }

    public static void main(String[] args) {
        Dominokette dk = new Dominokette(new Dominostein(4,2));
        System.out.println(dk);
        dk.fuegeRechtsAn(new Dominostein(2,6));
        System.out.println(dk);
        dk.fuegeRechtsAn(new Dominostein(1,6));
        System.out.println(dk);
        try {
            dk.fuegeRechtsAn(new Dominostein(1, 7));
            System.out.println(dk);
        }catch(IllegalArgumentException iae){
            System.out.println("Konnte Stein nicht anlegen");
        }
        try {
            dk.fuegeRechtsAn(new Dominostein(2, 2));
            System.out.println(dk);
        }catch(NumberFormatException nfe){
            System.out.println("Konnte Stein nicht anlegen: "+nfe.getMessage());
        }
        dk.fuegeLinksAn(new Dominostein(4,3));
        System.out.println(dk);
    }
}
