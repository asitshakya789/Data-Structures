public class RunThread extends Thread {
    public void run(){
        for(int  i =0 ;i<=10 ;i++){
            System.out.println(Thread.currentThread().getName()+"  " +i);
        }
    }
    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.run();


    }
}
