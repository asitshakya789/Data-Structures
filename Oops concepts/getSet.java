public class getSet {

    public static class Student {
        private String name;
        private int age;

        // public Student(String name, int age) {
        //     this.age = age;
        //     this.name = name;
        // }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Asit Kumar");
        s.setAge(19);
        s.displayInfo();
        
    }
}