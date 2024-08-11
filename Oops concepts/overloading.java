public class overloading {
    public int sum(int a ,int b ,int c){
        return a+b+c;
    }
    public int sum(int a ,int b){
        return a+b;
    }
    public double sum(double a , double b, double c, double d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        overloading obj = new overloading();
        System.out.println(obj.sum(1, 2, 3));
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(1.5, 2.5, 3.5, 4.5));
        
    }
}
