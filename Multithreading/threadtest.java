
public class ThreadTest {
    public static void main(String[] args) {
        a threadA = new a();
        b threadB = new b();
        threadA.start();
        threadB.start();
    }
}

class a extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tfrom Thread a i = " + i);
        }
        System.out.println("Exit from a");
    }
}

class b extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t\tfrom Thread b i = " + i);
        }
        System.out.println("exit from b");
    }
}