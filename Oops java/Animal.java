
public class Animal{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();
    }

    String color;
    void eat(){
        System.out.println("Eating...");
    }
    void breaths(){
        System.out.println("Breathing");
    }
}
class Dog extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming"); `q 
    }
}
