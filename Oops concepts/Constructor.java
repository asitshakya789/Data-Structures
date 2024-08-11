public class Constructor {
    public class Message {
        private String text;

        public Message(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static void main(String[] args) {
        Constructor outer = new Constructor(); // Create an instance of the outer class
        Message m = outer.new Message("Hello"); // Create an instance of the inner class Message
        System.out.println(m.getText()); // Prints "Hello"
        m.setText("World");
        System.out.println(m.getText()); // Prints "World"
    }
}
