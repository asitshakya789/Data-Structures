public class inheritance {
    public static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
        public void eat() {
            System.out.println("Animal eats");
        }
        public void sleep() {
            System.out.println("Animal sleeps");
        }
        public void move() {
            System.out.println("Animal moves");
        }
    }

    public static class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks");
        }
        public void play() {
            System.out.println("Dog plays");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.eat();
        d.sleep();
        d.move();
        d.bark();
        d.play();
    }
}