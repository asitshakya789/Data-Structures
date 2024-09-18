public class largest_string {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry", "date"};
        String largest = strArray[0];
        for (int i = 1; i < strArray.length; i++) {
            if (largest.compareTo(strArray[i]) <0) {
                largest = strArray[i];
                }
            }
                System.out.println("The largest string is: " + largest);
                
            }

    
}
