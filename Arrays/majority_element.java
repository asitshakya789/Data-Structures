public class majority_element {
    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote = 0 ; 
        for(int  i= 0; i<nums.length;i++){
            if(vote == 0){
                majority = nums[i];
            }else if( majority == nums[i]){
                vote  = vote +1 ;

            }else{
                vote = vote -1 ;
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,1,2,2};
        System.out.println(majorityElement(nums)); // 3

    }
}
