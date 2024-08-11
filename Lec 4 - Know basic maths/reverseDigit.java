public class reverseDigit {
    public static void main(String[] args) {
        int n =7789;
        int revnumber= 0 ;
        while (n>0) {
            int lastdigit = n%10;

            n =n/10;
            revnumber = (revnumber*10)+lastdigit;
        }
        System.out.println(revnumber);
    }
}
