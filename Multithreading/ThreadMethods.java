public class ThreadMethods {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        threadB.start(); // Start threadC
    }
}

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("Thread is running");
            }
            System.out.println("exit from A");
        }
    }
}

class B extends Thread {
    private boolean stopThread = false;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running");
            if (i == 3) {
                stopThread = true;
                break;
            }
            System.out.println("exit from B");
        }
    }
}