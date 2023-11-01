package retry;

import java.util.Arrays;

public class ArrayQueue2 {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue2(int capacity) {
        items = new int[capacity];
    }

    // Enqueue
    // dequeue
    // peek
    // isEmpty
    // isFull

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            return -1;
//            throw new IllegalStateException("Empty List");

        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getSize(){
        return count;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}