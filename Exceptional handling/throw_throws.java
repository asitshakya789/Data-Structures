public class throw_throws {
    public static void main(String[] args) {
        try{
            cheackage(15);
        }catch(Exception e){
            System.out.println("exception" + e.getMessage());
        }
    }
    public static void cheackage(int age) throws Exception{
        if(age<18){
            throw new Exception("You are not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
