public class RunnableExample {
    public static void main(String[] args) {
        Runs r = new Runs();
        Thread thread = new Thread(r);
        thread.start();
    }
}

class Runs implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("end of the thread");
    }
}