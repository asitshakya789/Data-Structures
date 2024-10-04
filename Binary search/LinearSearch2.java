
public class LinearSearch2 {
    public static int search(int[] number, int key) { // corrected parameter type from int to int[]
        for (int i = 0; i <= number.length; i++) { // corrected loop condition from i <= number.length to i < number.length
            if (number[i] == key) {
                return i;
            } else {
                return -1; // removed this line, should return -1 only after the loop
            }
        }
        return -1; // added this line to return -1 if key is not found
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 1;
        int index = search(number, key); // corrected variable name from index to key
    // corrected method call to search(number, key)
        if (index == -1) { // corrected variable name from index to key
            System.out.println("not found");
        } else {
            System.out.println("found at index " + index); // corrected variable name from index to key
        }
    }
}
