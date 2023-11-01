import java.util.NoSuchElementException;

public class LinkedList {


    private class Node {
        private int intValue;
        private Node nextNode;

        Node(int value) {
            this.intValue = value;
        }
    }


    private Node first;
    private Node last;

    LinkedList() {
    }

    //addFirst
    //addLast
    //removeFirst
    //removeLast
    //contains
    //indexOf

// firstNode  -----> ExistingNode1------> existingNode2 ------> existingNode3 ---->     LastNode
    //newNode

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty List");
        }
        if (first == last) { // the only node
            first = last = null;
            return;
        }
        //Traverse to get the node before the last node
        var existingLastNode = getPrevious(last);
        existingLastNode.nextNode = null;
        last = existingLastNode;

    }

    private Node getPrevious(Node targetNode) {
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.nextNode == targetNode) {
                return currentNode;
            }
            currentNode = currentNode.nextNode;  // The nextNode of last node will be equal to null
        }
        return null;
    }


    public int indexOf(int value) {
            int index = 0;
            var currentNode = first;
            while (currentNode != null) { // means it's not empty and not the last node
                if (currentNode.intValue == value) {
                    return index;
                }
                currentNode = currentNode.nextNode;
                index++;
            }
            return  -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty List");
        }
        if (first == last) { // the only node
            first = last = null;
            return;
        }
        var existingSecondNode = this.first.nextNode;
        this.first.nextNode = null;
        first = existingSecondNode;


    }


    public void addLast(int value) {
        var newNode = new Node(value);
        if (isEmpty()) {
            first = last = newNode;
            return;
        }
        var existingLastNode = this.last;
        existingLastNode.nextNode = newNode;
        last = newNode;

    }


    public void addFirst(int value) {
        var newNode = new Node(value);
        if (isEmpty()) {
            first = last = newNode;
            return;
        }
        newNode.nextNode = this.first;
        first = newNode;
    }


    public boolean isEmpty() {
        return first == null;
    }
}
