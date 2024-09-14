public class kadan_algorithm {

    public static int solution(int arr[]){
        int currsum = arr[0];
        int oversum = arr[0];

        for(int i = 1 ;i<arr.length;i++){
            if(currsum>=0){
                currsum = currsum + arr[i];
            }else{
                currsum = arr[i];
            }
            oversum = Math.max(oversum,currsum);
        }
        return oversum;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,-2,6,7,-10,-10,4,5,9,-3,4,7,-28,2,9,3,2,11};
        System.out.println(solution(arr));
    }
}
