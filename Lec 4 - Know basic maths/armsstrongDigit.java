public class armsstrongDigit {
    public static void main(String[] args) {
        int n = 371;
        int original = n ;
        int  lastdigit = 0 ;
        int sum = 0; 
        int reversedigit=0;
        while (n>0) {
            lastdigit = n%10;
            sum = sum+(lastdigit*lastdigit*lastdigit);
            n = n /10;
            reversedigit = (reversedigit*10)+lastdigit; 
        }
        if(original== sum){
            System.out.println("it is palindrom number ");  

        }else{
            System.out.println("number is not a palindrom");
        }
    }
}
