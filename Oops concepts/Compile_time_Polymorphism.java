public class Compile_time_Polymorphism {
    // Polymorphism using Method Overloading
    public class sums{
        public int sum(int a ,int b){
            return a+b;
        }
        public int sum(int a ,int b,int c ){
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        Compile_time_Polymorphism cp = new Compile_time_Polymorphism();
        sums s = cp.new sums();
        System.out.println(s.sum(4, 3));
        System.out.println(s.sum(4, 3, 1));
    }
}
