class LinkedListImplementationOfStack {

    
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private StackNode root;

    
    public boolean isEmpty() {
        return root == null;
    }

    
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        System.out.println(data + " pushed to stack");
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        int popped = root.data;
        root = root.next;
        return popped;
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return root.data;
    }

    
    public static void main(String[] args) {
        LinkedListImplementationOfStack stack = new LinkedListImplementationOfStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
    }
}