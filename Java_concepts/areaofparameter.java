
class rectangle{
    private  double hieght ;
    private  double width;
    public rectangle(double width , double hieght){
        this .hieght = hieght; 
        this .width = width;
    }
    public double calculatearea(){
        return hieght*width;
    }
    public double parameter(){
        return 2*(hieght+width);
    }

}
public class areaofparameter {
    public static void main(String[] args) {
        rectangle re = new rectangle(2, 5);
        System.out.println(re.calculatearea());
        System.out.println(re.parameter());
    }
}
