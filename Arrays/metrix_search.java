public class metrix_search {
    public static void search(int  matrix[][],int key){
        for(int i =  0 ;i<= matrix.length;i++){
            for(int j =0 ;j<matrix.length;j++){
                if(matrix[i][j] == key){
                    System.out.println("index at " + matrix[i][j]);

                }
                else{
                    System.out.println("not found");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        int key = 5;
        System.out.println(search(matrix, key));

    }
}