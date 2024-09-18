public class shallow {
     private String  name ;
    private int roll ;
    public shallow(String name , int roll){
        this.name = name ;
        this.roll = roll ;
    }
    public String getName(){
        return name ;
    }
    public String setname (){
        return name ;
    }
    public int getroll(){
        return roll ;
    }
    public int setroll(){
        return roll ;
    }
    public static void main(String[] args) {
        shallow s1 = new shallow("Asit", 1);
        shallow s2 = s1 ;
        s2.setname();
        s2.setroll();
        System.out.println(s1.getName());
        System.out.println(s1.getroll());
        System.out.println(s2.getName());
        System.out.println(s2.getroll());
    }


}

