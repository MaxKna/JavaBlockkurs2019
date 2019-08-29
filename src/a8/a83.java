package a8;

public class a83 {

    public static void main(String[] args) {
        int[][] test1 = {{1,2},{1,2}};
        int[][] test2 = {{1,2},{1,2},{1,2}};
        int[][] test3 = {{1,2},{1,2,3}};

        System.out.println(isSquare(test1));
        System.out.println(isSquare(test2));
        System.out.println(isSquare(test3));
    }

    public static boolean isSquare(int[][] test){
        int dim1 = test.length;
        for(int i = 0; i< test.length; i++){
            if(test[i].length != dim1){
                return false;
            }
        }
        return true;
    }
}
