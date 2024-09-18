public class reverse {
    public static void main(String[] args) {
        int  num = 43432;
        while (num>0){
        int  lastdegit = num%10;
        System.out.println(lastdegit);
        num = num /10;

        }
        System.out.println();

    }
}
