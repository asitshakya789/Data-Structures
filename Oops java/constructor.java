public class constructor {
    public static void main(String[] args) {
        student s1 = new student("asit ");
        System.out.println(s1.name);
        student s2  = new student(123);
        System.out.println(s2.roll);
    }

    
}
class student {

    String name; 
    int roll;

    student( String name){
        this.name = name;//parametarize constructor

    }
    student(int roll){
        this.roll = roll;  // constructor overloding
    }
    student(){
        System.out.println("This is a good boy");// non- parametarize constructor
    }
}