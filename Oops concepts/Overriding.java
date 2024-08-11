public class Overriding {
    public class Sum {
        public int sumTwo(int a, int b) {
            return a + b;
        }
    }

    public class Advanced extends Sum {
        @Override
        public int sumTwo(int a, int b) {
            return a + b + 10;
        }
    }

    public static void main(String[] args) {
        Overriding outer = new Overriding(); // Create an instance of the outer class
        Advanced ad = outer.new Advanced(); // Create an instance of the inner class Advanced
        System.out.println(ad.sumTwo(4, 3)); // This should print 17
    }
}
