class Solution{
    static void printPattern(int N){
        for(int i =1 ; i<=N ;i ++){
            for(int j=i ; j<=i;j++){
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) {
        printPattern(6);
        System.out.println();
    }
}