package DataStructure.CircularQueueUsingLinkedList;

public class Runner {
    public static void main(String[] args) {
        QueueUsingLL queueUsingLL = new QueueUsingLL();

        queueUsingLL.enQueue(new Node(1,23));
        queueUsingLL.enQueue(new Node(2,51));
        queueUsingLL.enQueue(new Node(3,98));
        queueUsingLL.enQueue(new Node(4,56));
        queueUsingLL.deQueue();
        queueUsingLL.count();
        queueUsingLL.display();;


    }


}
