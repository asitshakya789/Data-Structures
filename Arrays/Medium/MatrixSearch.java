public class MatrixSearch {
    public static void search(int[][] matrix, int key) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int key = 5;
        search(matrix, key);
    }
}