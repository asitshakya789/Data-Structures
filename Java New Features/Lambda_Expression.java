public class Lambda_Expression {
    /**
     * InnerLambda_Expression
     */
    public interface InnerLambda_Expression {

        void execute();
    }
    public static void main(String[] args) {
        // Lambda expression
        InnerLambda_Expression lambda = () -> System.out.println("Hello, Lambda");
    }
}
