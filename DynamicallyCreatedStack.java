public class DynamicallyCreatedStack {

    private int top;
    private int maxSize;
    private int[] stackArray;

    
    public DynamicallyCreatedStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1; 
        this.stackArray = new int[maxSize]; 
    }

    
    public boolean isFull() {
        if (top == maxSize - 1) {
            System.out.println("Will not be able to push, stack is full.");
            return true;
        }
        return false;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    
    public void push(int item) {
        if (isFull()) {
            return;
        }
        stackArray[++top] = item;
        System.out.println(item + " pushed to stack.");
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return Integer.MIN_VALUE;
        }
        return stackArray[top--];
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no element to peek.");
            return Integer.MIN_VALUE;
        }
        return stackArray[top];
    }

    
    public static boolean checkIfOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        DynamicallyCreatedStack stack = new DynamicallyCreatedStack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek());
        System.out.println(stack.pop() + " popped from stack.");
    }
}