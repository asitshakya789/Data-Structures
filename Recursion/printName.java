/**
 * PrintName
 */
public class printName {

    static void printname(int i, int n) {
        if (i > n) { // base case: stop recursion when i exceeds n
            return;
        }
        System.out.println("Asit Kumar");
        printname(i + 1, n); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        printname(i ,n);
    }
}