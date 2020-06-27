package DataStructure.CircularQueueUsingLinkedList;

public class Node {
    int key;
    int data;
    Node next;

    public Node() {
        key=0;
        data=0;
        next=null;
    }

    public Node(int k, int d) {
        key = k;
        data = d;
    }
}
