public class Abstraction {

    abstract class Student {
        void study() {
            System.out.println("Student is studying");
        }

        abstract void running();
        abstract void play();
    }

    class Grade1 extends Student {
        @Override
        void study() {
            System.out.println("Grade 1 student is studying");
        }

        @Override
        void running() {
            System.out.println("Grade 1 student is running");
        }

        @Override
        void play() {
            System.out.println("Grade 1 student is playing");
        }
    }

    public static void main(String[] args) {
        Abstraction outer = new Abstraction(); // Create an instance of the outer class
        Grade1 g1 = outer.new Grade1(); // Create an instance of the inner class Grade1

        g1.study();    // This will call the overridden method in Grade1
        g1.running();  // This will call the implemented method in Grade1
        g1.play();     // This will call the implemented method in Grade1
    }
}
