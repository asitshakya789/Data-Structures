
/**
 * class_objects
 */
public class class_objects {

    private String color;
    private int speeds;
    
    public  void printcar(String color, int speeds){
        this.color = color;
        this .speeds= speeds;
    }
    public void carspeed(int speeds){
        speeds = speeds +10 ;
        System.out.println("the currunt speeds of the car is "+speeds);
    }
    public String getcolor(){
        return color ;
    }
    public static void main(String[] args) {
        class_objects co = new class_objects();
        co.printcar("RED",20);
    }
}
