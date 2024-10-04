public class linear_search {
    public static int leaner_serch(int number [],int search) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = { 3,44,32,5,53,3,4};
        int search = 4;
        int index = leaner_serch(number,search);
        if(index == -1){
            System.out.println("not found");
        }
        else
        {
            System.out.println("found at index " + index);
        }


    }
    
}
