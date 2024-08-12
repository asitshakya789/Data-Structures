public class threadtest {
    public static void main(String[] args) {
        new a().start();
        new b().start();
    }
}
class a extends Thread{
    public void run(){
        for(int i =1 ;i<=5;i++){
            System.out.println("\tfrom Thread a i = "+i);
        }
        System.out.println("Exit from a");
    }
}
class b extends Thread{
    public void run(){
        for(int i= 0;i<=5 ;i++){
            System.out.println("\t\tfrom Thread b i = "+i);
        }
        System.out.println("exit from b");
    }
}
