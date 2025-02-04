import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    // Check if the stack is empty
    public boolean isEmpty() {
        return this.size() == 0;
    }

    // Get the size of the stack
    public int getSize() {
        return this.size();
    }

    // Peek at the top element of the stack (without removing it)
    public Object peek() {
        if (!isEmpty()) {
            return this.get(this.size() - 1);
        }
        return null;  // Return null if the stack is empty
    }

    // Pop the top element from the stack (remove it and return it)
    public Object pop() {
        if (!isEmpty()) {
            Object o = this.get(this.size() - 1);
            this.remove(this.size() - 1);
            return o;
        }
        return null;  // Return null if the stack is empty
    }

    // Push a new element onto the stack
    public void push(Object o) {
        this.add(o);
    }

    // Override the toString method to display the stack
    @Override
    public String toString() {
        return "stack: " + super.toString();
    }

    // Main method for testing the MyStack class
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println(stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());

        // Display the stack again after popping
        System.out.println(stack);
    }
}