public class shortest_path {
    public static float getshortestpatth(String path) {
        int x =0 , y = 0 ;
        for(int i = 0; i<path.length();i++){
            char c = path.charAt(i);
            if(c == 's'){
                y--;
            }
            else if(c == 'n'){
            y++;
            }
            else if(c == 'w'){
                x--;
            }
            else {
                x++;
            }
            
        }
        return (float)Math.sqrt(x*x + y*y);
                        
            
        
    }
    public static void main(String[] args) {
        System.out.println(getshortestpatth("wneenesennn"));
    }
    
}
