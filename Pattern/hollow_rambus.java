public class hollow_rambus {

    public static void pattern (int n){
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
    }
    public static void main(String[] args) {
        pattern(6);
    }
}