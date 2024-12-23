package GFG;

public class Searchmatrix {
    public boolean searchrow(int[][] mat , int x){
        int n = mat.length;
        int m = mat[0].length;
        if(mat == null || n == 0){
            return false;
        }
        for(int  i =0 ; i< n ; i++){
            for(int  j =0 ; j< mat[i].length ; j++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Searchmatrix obj = new Searchmatrix();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 22;
        System.out.println(obj.searchrow(mat, x));
    }   
}
