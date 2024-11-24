public class Knapsack01Problem {

    public static int Knapsack(int capacity, int weight[], int value[], int n) {
        if (n == 0 || capacity == 0) {
            return 0;
        }
        if (weight[n - 1] > capacity) {
            return Knapsack(capacity, weight, value, n - 1);
        } else {
            return Math.max(Knapsack(capacity, weight, value, n - 1),
                    value[n - 1] + Knapsack(capacity - weight[n - 1], weight, value, n - 1));
        }
    }

    public static void main(String[] args) {
        int[] weight = { 2, 3, 4, 5 };
        int[] value = { 10, 20, 30, 40 };
        int capacity = 10;
        int n = value.length;
        System.out.println(Knapsack(capacity, weight, value, n));
    }
}