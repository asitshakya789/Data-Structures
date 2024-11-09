public class operation {
    int stack[];
    int top;
    int size;

    public operation(int stackSize) {
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int getSize() {
        return top + 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE; // Consider throwing an exception instead
        }
        return stack[top];
    }

    public int pop() {
        int val = peek();
        if (val != Integer.MIN_VALUE) {
            top--;
        }
        return val;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
            if (i != top) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        operation op = new operation(10);

        // Test the stack operations
        op.push(1);
        op.push(2);
        op.push(3);
        op.printStack(); // Should print: 1 -> 2 -> 3

        System.out.println("Top element is: " + op.peek()); // Should print: Top element is: 3
        System.out.println("Stack size is: " + op.getSize()); // Should print: Stack size is: 3

        op.pop();
        op.printStack(); // Should print: 1 -> 2

        System.out.println("Is stack empty? " + op.isEmpty()); // Should print: Is stack empty? false

        op.pop();
        op.pop();
        System.out.println("Is stack empty? " + op.isEmpty()); // Should print: Is stack empty? true
        op.pop(); // Should indicate that the stack is empty
    }
}