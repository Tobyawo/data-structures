public class ArrayList {

    private int[] arr;
    private int length;
    private int count;

    private int initialSize = 3;


    // Initializaing array
    ArrayList() {
        this.count = -1;
        arr = new int[initialSize];
    }

    ArrayList(int initialSize) {
        this.count = -1;
        arr = new int[initialSize];
    }


    public int getSize() {
        return this.count;
    }

    public int getItemAtIndex(int itemIndex) {
        return arr[itemIndex];
    }

    public void add(int num) {

        resizeWithExistingData();
        arr[count + 1] = num;
        count++;
        System.err.println("Item added to list");
    }


    public boolean isEmpty() {
        return this.count == -1;
    }


    public void insertAt(int num, int index) {
        if (index < count) {
            resizeWithExistingData();
                // Start shifting from the back of the array
                for (int i = count+1; i >= index; i--) {
                    if (i == index) {
                        arr[i] = num;
                        count++;
                        System.err.println("Successfully inserted " + num + " at index " + i);
                        break;
                    }
                    arr[i] = arr[i - 1];
                }
            }
        else {
            System.err.println("Index is more than array size");
        }

    }

    private void resizeWithExistingData() {
        if (this.count == arr.length - 1) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            System.err.println("List resized to " + arr.length * 2);
            arr = newArr;
        }
    }


    public void reverse() {
        // arr = {1,2,3,4,5} 01234
        // rev = {5,4,3,2,1}
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[(arr.length - 1) - i] = arr[i];
        }
        arr = reversedArr;

    }

    public int max() {
        int max = arr[0];
        for (int i = 0; i <= count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 0; i <= count; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void removeAt(int index) {
        if (index < count) {
            if (!isEmpty()) {
                // Start shifting from the front of the array
                for (int i = index; i <= count; i++) {
                    int nextValue = arr[i + 1];
                    arr[i] = nextValue;
                }
                count--;
            } else {
                System.err.println("List is Empty");
            }
        } else {
            System.err.println("Index is more than List size");
        }
    }


    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i <= count; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public String toString() {
        return java.util.Arrays.toString(arr);

    }
}
