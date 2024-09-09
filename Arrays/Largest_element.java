public class Largest_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int Largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
                
            }
        
        }
        System.out.println("the largest element is " + Largest);

    }

}
