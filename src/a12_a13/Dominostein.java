package a12_a13;

public class Dominostein {

    private int left;
    private int right;

    public Dominostein(int left, int right) {
        setLeft(left);
        setRight(right);
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        if(left < 0 || left > 6){
            throw new IllegalArgumentException();
        }
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        if(right < 0 || right > 6){
            throw new IllegalArgumentException();
        }
        this.right = right;
    }

    @Override
    public String toString() {
        return "["+left+"|"+right+"]";
    }

    public static void main(String[] args) {
        Dominostein d = new Dominostein(3,2);
        System.out.println(d);
    }


    //A13

    public Dominostein(Dominostein d){
        this.left = d.left;
        this.right = d.right;
    }

    public void dreheUm(){
        int swap = this.left;
        this.left = this.right;
        this.right = swap;
    }

    public int[] getValues(){
        return new int[] {left,right};
    }
}
