public class nested_try {
    public static void main(String[] args) {
        try {
            int a =2 ,b =4 , c =2 ,x =7 ,z;
            int  p[] = {3};
            p[3] = 33;
            try {
                z = x/((b*b)-(4*a*c));
                System.out.println("the value of z +"+z);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("division by zero");
                
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("array index is out of bound");
        }
    }
}
