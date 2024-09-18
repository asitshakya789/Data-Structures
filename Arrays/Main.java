public class Main {
  public static int binarsyearch(int [] number,int key){
    int start = 0;
    int end = number.length-1;
    while (start<=end) {
      int mid = (start+end)/2;
        if(key==number[mid]){
          return mid;
        
      }

      
    }
  }
}