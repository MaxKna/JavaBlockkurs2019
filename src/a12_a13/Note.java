package a12_a13;

public class Note {

    private double note;

    public Note(double note) {
        setNote(note);
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        switch (note+""){
            case "1.0":
            case "1.3":
            case "1.7":
            case "2.0":
            case "2.3":
            case "2.7":
            case "3.0":
            case "3.3":
            case "3.7":
            case "4.0":
            case "5.0":
                this.note = note;
                break;
            default:
                throw new IllegalArgumentException("Ungueltiger Notenwert: "+note);
        }
    }

    @Override
    public String toString() {
        return getNote()+"";
    }

    public static void main(String[] args) {
        Note note = new Note(1.3);
        System.out.println(note);
        try{
            note.setNote(5.3);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }


    //A13

    public Note(Note n){
        this.note = n.note;
    }

    public boolean hatBestanden(){
        return this.note < 4.0;
    }
}
