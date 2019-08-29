package a6;

public class a62 {

    public static void main(String[] args) {
        printV1(5);
        printV2(5);
    }

    public static void printV1(int size){
        for(int i = 1; i<= size; i++){
            for(int j = 0; j< i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void printV2(int size){
        int length = 2*size -1;
        for(int i = 1; i<= size; i++) {
            int lineLength = 2*i-1;
            int preChars = (length-lineLength)/2;
            for(int j = 0; j< preChars; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j< i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
