

class sum {
    public int sumtwo(int a , int b ){
        return a+b;
    }
    public int sumtwo(int a ,int b , int c ){
        return a+b +c;
    }
}
class advanced extends sum{
    public int sumtwo(int a ,int b ){
        return a+b+10;
    }
}

public class overloading_overriding {
    public static void main(String[] args) {
        sum s = new sum();
        advanced ad = new advanced();
        System.out.println(s.sumtwo(4, 3));
        System.out.println(s.sumtwo(4, 3, 1));
        System.out.println(ad.sumtwo(3, 2));


    }
}
