public class Encapsulation {
    private String name;
    private int age;


    public  String getname(){
        return name;
    }
    public void setname(String name){
        this.name =name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        if(age>=10){
            this.age =age;
        }else{
            System.out.println("age is less than 10");
        }
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setname("Asit kumar");
        obj.setage(9);

        System.out.println("name is "+obj.getname());

    }
}
