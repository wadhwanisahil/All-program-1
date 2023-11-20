package Queue;
class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to remove front element from the queue
    // and check for Queue Underflow
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println("Dequeued: " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    // Utility function to add an item to the queue and check
    // for queue overflow
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to return front element in the queue and
    // check for Queue Underflow
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 to indicate an empty queue
        }
        return arr[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return count == 0;
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return count == capacity;
    }
}

class Main {
    public static void main(String[] args) {
        // create a queue of capacity 5
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
    }}
