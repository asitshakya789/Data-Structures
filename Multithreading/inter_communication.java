public class inter_communication {
    public static void main(String[] args) {
         final costomer c = new costomer();
         new Thread(){
            public void run(){
                c.withdraw(150);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposite(1000);
            }
        }.start();
    }
    
}
class costomer{
    int amount =1000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<=amount){
            System.out.println("insufficient balance");
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        this.amount = amount-amount;
        System.out.println("withdraw complete");
    }
    synchronized void deposite(int amount){
        System.out.println("going to deposite");
        this.amount= amount +amount;
        System.out.println("deposite complete");
        notify();
    }
}
 