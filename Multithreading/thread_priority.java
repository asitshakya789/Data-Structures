public class thread_priority {
    public static void main(String[] args) {
        a athread = new  a();
        b bthread = new b();
        c cthread = new c();

            cthread.setPriority(Thread.MAX_PRIORITY);
            bthread.setPriority(Thread.MIN_PRIORITY);
            cthread.setPriority(athread.getPriority()+1);
            System.out.println("start the thread");
            athread.start();

            System.out.println("start the thread b");
            bthread.start();

            System.out.println("start the thread c");
            cthread.start();


    }
}
class a extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread A");
        }
        System.out.println("Exit to the a");
    }
}
class b extends Thread{
    public void run(){
        for(int i = 0 ;i<10;i++){
            System.out.println("Thread B");
        }
        System.out.println("Exit to the b");
    }
}
class c extends Thread{
    public void run(){
        for(int i = 0 ;i<10;i++){
            System.out.println("Thread B");
        }
        System.out.println("Exit to the b");
    }
}