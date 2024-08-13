public class ThreadPriority {
    public static void main(String[] args) {
        A athread = new A();
        B bthread = new B();
        C cthread = new C();

        cthread.setPriority(Thread.MAX_PRIORITY);
        bthread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("start the thread");
        athread.start();

        System.out.println("start the thread b");
        bthread.start();

        System.out.println("start the thread c");
        cthread.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A");
        }
        System.out.println("Exit to the A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B");
        }
        System.out.println("Exit to the B");
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread C");
        }
        System.out.println("Exit to the C");
    }
}