

/**
 * constructorProgram
 */
public class constructorProgram {

    private String name;
    private int roll;

    // Constructor
    public constructorProgram(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayinfo() {
        System.out.println("Name " + name);
        System.out.println("Roll " + roll);
    }

    public static void main(String[] args) {
        constructorProgram cp = new constructorProgram("Asit kumar", 18);
        cp.displayinfo();
    }
}