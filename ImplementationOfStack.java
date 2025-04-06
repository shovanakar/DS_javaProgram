import java.util.EmptyStackException;

public class ImplementationOfStack {
    private int top;
    private int capacity;
    private int[] stackArray;

    
    public ImplementationOfStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stackArray = new int[capacity];
    }

    
    public boolean isFull() {
        return top == capacity - 1;
    }


    public boolean isEmpty() {
        return top == -1;
    }

    
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = item;
        System.out.println(item + " pushed to stack");
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }


    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }


    public static void main(String[] args) {
        ImplementationOfStack stack = new ImplementationOfStack(100);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Top element is " + stack.peek());
    }
}