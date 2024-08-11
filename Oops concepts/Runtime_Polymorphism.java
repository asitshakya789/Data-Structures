public class Runtime_Polymorphism {
    // Polymorphism using Method Overriding

    public class info{
        void numberbank(){
            System.out.println("Number Bank");
        }
        void numbercard(){
            System.out.println("Number Card");
        }
    }
    public class info1 extends info{
        @Override
        void numberbank(){
            System.out.println("Bank Account Number");
        }
        
    }
    public static void main(String[] args) {
        Runtime_Polymorphism rn = new Runtime_Polymorphism();
        info1 obj = rn.new info1();
        obj.numberbank();
        obj.numbercard();
        
        
    }
}
