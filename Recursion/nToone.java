public class nToone {
    static void numbers(int i, int n) {
        if (i < n) {
            return;
        }
        System.out.println(i);
        numbers(i - 1, n);
    }

    public static void main(String[] args) {
        int i = 5;
        int n = 1;
        numbers(i, n);
    }
}
