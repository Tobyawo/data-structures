import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue {

    private int[] arr;
    private int count;


    Queue(int size) {
        count = -1;
        arr = new int[size];
    }


    public int peek() {
        if (isEmpty()) {
            return arr[0];
        }
        throw new IllegalStateException("Queue is empty");
    }

    public int element() {
        if (isEmpty()) {
            return arr[0];
        }
        throw new NoSuchElementException("Queue is empty");
    }


    public int poll() {
        if (!isEmpty()) {
            int polledItem = arr[0];
            if (count == 0) {
                arr[0] = 0;
            } else {
                for (int i = 1; i <= count; i++) {
                    int currentVal = arr[i];
                    arr[i - 1] = currentVal;
                    if (i == count) {
                        arr[i] = 0;
                    }
                }
            }
            count--;
            return polledItem;
        } else {
            throw new IllegalStateException("Empty queue");
        }
    }


    public String remove() {
        if (isEmpty()) {
            int polledItem = arr[0];
            for (int i = 1; i <= count; i++) {
                int currentVal = arr[i];
                arr[i - 1] = currentVal;
                if (i == count) {
                    arr[i] = 0;
                }
            }
            count--;
            return String.valueOf(polledItem);
        } else {
            throw new NoSuchElementException("Queue is empty");
        }
    }


    public void add(int newValue) {
        if (!isFull()) {
            arr[count + 1] = newValue;
            count++;
            System.err.println("New Item added");
        } else {
            System.err.println("Queue is filled up");
            throw new IllegalStateException("Queue is filled up");
        }
    }


    public boolean isEmpty() {
        return count == -1;
    }

    public boolean isFull() {
        int length = arr.length - 1;
        return length == count;
    }

    public int getSize() {
        return this.count + 1;
    }


    public String toString() {
        return Arrays.toString(arr);
    }


}
