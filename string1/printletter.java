public class printletter {
    
    public static void printletters(String str){
        for(int  i  = 0 ; i< str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printletters("Hello");
        printletters("World");
    }
}
