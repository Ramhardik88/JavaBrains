package DataStructure.CircularQueueUsingLinkedList;

public class QueueUsingLL {
            Node front;
            Node rear;

    public QueueUsingLL() {
        front=null;
        rear=null;
        
    }
    public boolean isEmpty()
    {
         if(front==null && rear==null)
         {
             return true;

         }
         else
             return false;
    }
    public boolean checkIfNodeExists(Node n)
    {
        Node temp= front;
        boolean exists=false;
        do
        {
            if(temp.key==n.key)
            {
                exists=true;
                break;
            }
            temp=temp.next;
        }while (temp!=front);
        return exists;
    }
    public void enQueue(Node n)
    {
        if(isEmpty())
        {
            front=n;
            rear=n;
            System.out.println("Node enqueue Successfully");
        }
        else if(checkIfNodeExists(n))
        {
            System.out.println("Node already exists with this key value.");
            System.out.println("Enter the node with different key value");
        }
        else
        {
            rear.next=n;
            rear=n;
            n.next=front;
            System.out.println("Node enqueue Successfully");

        }
    }
    public Node  deQueue()
    {
        Node temp=null;
        if(isEmpty())
        {
            System.out.println("node doesn't exists!");
            return null;
        }
        else
        {
            if(front==rear)
            {
                temp=front;
                front=null;
                rear=null;
                return temp;
            }
            else
            {
                temp=front;
                front=front.next;
                rear.next=front;
                return temp;
            }
        }
    }
    public int count()
    {
        int count=0;
        Node temp=front;
        do
        {
            count++;
            temp=temp.next;
        }while (temp!=front);
        return count;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("no node exists");
        }
        else
        {
            System.out.println("all the values in queue are :");
            Node temp= front;
            do
            {
                System.out.println("the key is : "+ temp.key + "the data is  : "+temp.data);
                temp=temp.next;

            }while (temp!=null);
              System.out.println("the key is : "+ temp.key + "the data is  : "+temp.data);
            System.out.println();
        }
    }
}
