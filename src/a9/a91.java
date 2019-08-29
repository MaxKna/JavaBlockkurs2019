package a9;

public class a91 {

    public static void main(String[] args) {
        System.out.println(getCharCount("Labrakadabrador",'a'));
    }

    public static int getCharCount(String s, char c){
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
