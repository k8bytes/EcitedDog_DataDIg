import java.util.ArrayList;

public class E19_02<E> extends ArrayList<E> {
    public int getSize() {
        return this.size();
    }

    public E peek() {
        return this.get(this.size() - 1);
    }

    public void push(E o) {
        this.add(o);
    }

    public E pop() {
        return this.remove(this.size() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }

    public static void main(String[] args) {
        // test using strings
        E19_02<String> stack1 = new E19_02<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println("stack1: " + stack1);

        System.out.println("Popped from stack1: " + stack1.pop());
        System.out.println("After pop, stack1: " + stack1);

        // test using integers
        E19_02<Integer> stack2 = new E19_02<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("stack2: " + stack2);

        System.out.println("Popped from stack2: " + stack2.pop());
        System.out.println("After pop, stack2: " + stack2);
    }
}
