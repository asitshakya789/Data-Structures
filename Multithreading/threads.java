public class threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        });
        t1.start(); // Start the thread
    }
}