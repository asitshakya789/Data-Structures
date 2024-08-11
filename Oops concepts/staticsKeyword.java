public class staticsKeyword {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the static method directly using the class name
        System.out.println(staticsKeyword.sum(10, 20)); // This will print 30
    }
}
