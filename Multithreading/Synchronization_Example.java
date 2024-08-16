public class Synchronization_Example {
}
class synctask extends Thread{
    sheraderesourse se;
    public synctask(sheraderesourse se){
        this.se = se;

    }
    public void run(){
        se.printnumber();
    }

}
class sheraderesourse{
    synchronized void printnumber(){
        for(int  i =1 ;i<10 ;i++){
            System.out.println(i);
        }

    }
}