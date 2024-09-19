public class maximum_consicutive {
    static int findmaxconsicutive(int nnms[]){
        int max=0;
        int count = 0 ;
        for(int i=0;i<nnms.length;i++){
            if(nnms[i]==1){
                count++;
            }else{
                count =0 ;
            }
            max= Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int nnms[] = {1, 1, 0, 1, 1,1,1,1,0,0,0,1,1};
        System.out.println(findmaxconsicutive(nnms));
        
    }    
}
