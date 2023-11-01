

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList(3);
        System.err.println("List is Empty " + arrayList.isEmpty());
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(32);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);

//        arrayList.insertAt(5, 4);
//        arrayList.insertAt(6, 5);
//        arrayList.insertAt(7, 6);
//        arrayList.insertAt(8, 7);

        arrayList.removeAt(5);

        System.err.println("Index of num is " + arrayList.indexOf(32));
        System.err.println(arrayList.toString());
        System.err.println("Max : " + arrayList.max());
        System.err.println("Min : " + arrayList.min());
        System.err.println("List is Empty " + arrayList.isEmpty());

        arrayList.reverse();


//
//        Arrays arrays = new Arrays(12);
//        arrays.insert(1);
//        arrays.insert(2);
//        arrays.insert(2);
//        arrays.insert(2);
//        arrays.insert(4);
//        arrays.insert(4);
//        arrays.insert(4);
//        arrays.insert(4);
//
//        arrays.insertAt(3, 2);
//        arrays.insertAt(5, 4);
//        arrays.insertAt(6, 5);
//        arrays.reverse();
//        System.err.println("Max : " + arrays.max());
//        System.err.println("Min : " + arrays.min());
//        System.err.println(arrays.toString());
//
//        System.err.println("Counts of items are : " + arrays.getCountsOfItems());
//        System.err.println("Counts of Duplicated items are : " + arrays.getCountsOfDuplicatedItems());
//
////        arrays.removeAt(5);
////        arrays.removeAt(4);
//
//
//        System.err.println("Index of num is "+arrays.indexOf(4));
//
//
////        System.err.println(arrays.getLength());
////        System.err.println(arrays.isFull());
////        System.err.println(arrays.isEmpty());
//        System.err.println(arrays.toString());


    }
}