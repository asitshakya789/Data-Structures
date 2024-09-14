public class Check_sort {
        public static int isSorted(int n, int []a) {
            // Write your code here.
            for(int  i = 1;i<n ;i++){
                if(a[i-1]>a[i]){
                    return 0;
                }
            }
            return 1 ;
    
        }
        public static void main(String[] args) {
            int n = 5;
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(isSorted(n, a));

        }
    
}