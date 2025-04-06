public class EmptyQueue {

    private int front, rear, size;
    private int capacity;
    private int[] array;

    
    public EmptyQueue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1; 
        this.array = new int[this.capacity]; 
    }

    
    public boolean isFull() {
        return this.size == this.capacity;
    }

    
    public boolean isEmpty() {
        return this.size == 0;
    }

    
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue.");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity; 
        this.array[this.rear] = item;
        this.size += 1;
        System.out.println(item + " enqueued to queue.");
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity; 
        this.size -= 1;
        return item;
    }

    
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No rear element.");
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }

    public static void main(String[] args) {
        EmptyQueue queue = new EmptyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Front item: " + queue.front());
        System.out.println("Rear item: " + queue.rear());
    }
}