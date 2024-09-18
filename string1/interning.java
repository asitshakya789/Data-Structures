public class interning {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String();
        String s3 = "Hello World";
        if(s1 == s2){
            System.out.println("s1 and s2 are same");
        }else{
            System.out.println("s1 and s2 are not same");
        }
        if(s1 == s3){
            System.out.println("s1 and s3 are same");
        }else{
            System.out.println("s1 and s3 are not same");
        }
    }

}
