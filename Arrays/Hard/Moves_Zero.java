public class Moves_Zero {
        public static int[] moveZeros(int n, int[] a) {
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }
            }
            return a;
        }
        public static void main(String[] args) {
            int[] a = {1, 0, 0, 3, 12};
            int n = a.length;
            int[] result = moveZeros(n, a);
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
        }

}
