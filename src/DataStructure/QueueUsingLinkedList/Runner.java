package DataStructure.QueueUsingLinkedList;

public class Runner {
    public static void main(String[] args) {
        Queue queue= new Queue();
        System.out.println(queue.isEmpty());
        queue.disPlay();

        queue.enQueue(new Node(1,23));
        queue.enQueue(new Node(2,34));
        queue.enQueue(new Node(3,1));
        System.out.println(queue.count());
        queue.enQueue(new Node(4,13));
        queue.enQueue(new Node(5,67));
        queue.disPlay();
        System.out.println(queue.count());
        queue.deQueue();
        queue.disPlay();


    }

}
