import java.util.HashMap;
import java.util.Map;

public class Arrays {

    private int[] arr;
    private int length;
    private int count;


    // Initializaing array
    Arrays(int size) {
        this.length = size;
        this.count = -1;
        arr = new int[size];
    }

    Arrays(int size, boolean resize) {
        this.length = size;
        this.count = -1;
        arr = new int[size];
    }

    public int getLength() {
        return this.length;
    }

    public int getItemAtIndex(int itemIndex){
        return arr[itemIndex];
    }

    public void insert(int num) {
        if (!isFull()) {
            arr[count + 1] = num;
            count++;
        } else {
            System.err.println("Array is filled up");
        }
    }


    public boolean isFull() {
        return (this.count) == this.length-1;
    }

    public boolean isEmpty() {
        return this.count == -1;
    }


    public void insertAt(int num, int index) {
        if(index < arr.length) {
            if (!isFull()) {
                // Start shifting from the back of the array
                for (int i = arr.length - 1; i >= index; i--) {
                    if (i == index) {
                        arr[i] = num;
                        count++;
                        System.err.println("Successfully inserted " + num + " at index " + i);
                        break;
                    }
                    arr[i] = arr[i-1];
                }
            } else {
                System.err.println("Array filled up");
            }
        }else {
            System.err.println("Index is more than array size");
        }

    }



    public void reverse() {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length -1; i >=0 ; i--) {
            reversedArr[(arr.length-1)-i] = arr[i];
        }
        arr =  reversedArr;

    }

    public int max() {
        int max = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > max){
                max = i;
            }
        }
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < min){
                min = i;
            }
        }
        return min;
    }

    public void removeAt(int index) {
        if(index < arr.length) {
            if (!isEmpty()) {
                // Start shifting from the front of the array
                for (int i = index; i <= count; i++) {
              int nextValue = arr[i+1];
                    arr[i] = nextValue;
                }
                count--;
            } else {
                System.err.println("Array is Empty");
            }
        }else {
            System.err.println("Index is more than array size");
        }
    }


    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == value){
                index = i;
                break;
            }
        }
        return index;
    }

    public String toString(){
        return java.util.Arrays.toString(arr);


    }


    public String getCountsOfItems(){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            boolean check = map.containsKey(num);
            if(check){
                int value = map.get(num) + 1;
                map.replace(num, value);
            }else {
                map.put(num, 1);
            }
        }
        return map.toString();
    }


    public String getCountsOfDuplicatedItems(){
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> mapDup = new HashMap<>();

        //Using for loop
//        for (int num : arr) {
//            boolean check = map.containsKey(num);
//            if(check){
//                int value = map.get(num) + 1;
//                map.replace(num, value);
//            }else {
//                map.put(num, 1);
//            }
//        }
// Using Streams
        java.util.Arrays.stream(arr).forEach(item -> {
            boolean check = map.containsKey(item);
            if(check){
                int value = map.get(item) + 1;
                map.replace(item, value);
            }else {
                map.put(item, 1);
            }
        });

        map.keySet().forEach(key -> {
            int count = map.get(key);
            if(count > 1){
                mapDup.put(key, count);}} );
        return mapDup.toString();
    }

}
