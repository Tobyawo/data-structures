import retry.PrintMatchingElements;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        LinkedList linkedList1 = new LinkedList();
//        linkedList1.addLast(1);
//        linkedList1.addLast(2);
//        linkedList1.addLast(3);
//        linkedList1.addLast(4);
//        linkedList1.addLast(5);
//        linkedList1.addLast(6);
//        linkedList1.addLast(7);
//        linkedList1.addFirst(1);
//        linkedList1.addFirst(1);
//        linkedList1.deleteLast();
//        linkedList1.deleteLast();
//        linkedList1.deleteLast();

//        System.err.println("Contains " + linkedList1.contains(0));
//
//        System.err.println("Index of " + linkedList1.indexOf(1));

//        linkedList1.deleteFirst();
//        System.err.println(linkedList1.isEmpty());

//        Queue queue = new Queue(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.err.println("Peek item from queue " + queue.poll());
//        System.err.println("Peek item from queue " + queue.poll());
//        queue.add(5);
//        queue.add(6);
//        System.err.println("Peek item from queue " + queue.poll());
//        queue.add(7);
//        System.err.println("Peek item from queue " + queue.poll());

//        System.err.println("Queue size is " + queue.getSize());
//        System.err.println("Queue is " + queue);

//
//        ArrayQueue arrayQueue = new ArrayQueue(4);
//        arrayQueue.enqueue(1);
//        arrayQueue.enqueue(2);
//        arrayQueue.enqueue(3);
//        arrayQueue.enqueue(4);
//        System.err.println("Size is " + arrayQueue.getSize());
//        System.err.println("Is full "+ arrayQueue.isFull());
//        System.err.println("Is empty " + arrayQueue.isEmpty());
//        System.err.println("Peek item from queue " + arrayQueue.dequeue());
//        System.err.println("Peek item from queue " + arrayQueue.dequeue());
//        arrayQueue.enqueue(5);
//        arrayQueue.enqueue(6);
//        System.err.println("Peek item from queue " + arrayQueue.dequeue());
//        arrayQueue.enqueue(7);
//        System.err.println("Peek item from queue " + arrayQueue.dequeue());
//        System.err.println("Size is " + arrayQueue.getSize());
//        System.err.println("Is full "+ arrayQueue.isFull());
//        System.err.println("Is empty " + arrayQueue.isEmpty());
//        System.err.println("Peek is " + arrayQueue.peek());

//        System.err.println("Queue size is " + arrayQueue.getSize());
//        System.err.println("Queue is " + arrayQueue);


        int[] array = {2,2,3,4,2,4,6,7,6};

        PrintMatchingElements.printMatchingElements(array);
        PrintMatchingElements.printMatchingElementsWithCount(array);





    }
}