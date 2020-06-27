package DataStructure.QueueUsingLinkedList;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        front=null;
        rear=null;
    }

    public  boolean isEmpty()
    {
        if(front==null && rear== null)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public  boolean checkIfNodeExists(Node n)
    {
        Node temp=front;
        boolean exists=false;
        while (temp!=null)
        {
          if(temp.key==n.key)
          {
              exists=true;
              break;
          }
          temp=temp.next;
        }
        return exists;
    }

    public void enQueue(Node n)
    {
        if(isEmpty())
        {
            front=n;
            rear=n;
            System.out.println("Node enQueue Successfully");
        }
        else if(checkIfNodeExists(n))
        {
            System.out.println("Node already With same Key value. Enter different Key value");
        }
        else {
            rear.next=n;
            rear=n;
            System.out.println("Node enQueue Successfully");
        }
    }

    public Node deQueue()
    {
        Node temp=null;
        if(isEmpty())
        {
            System.out.println(" queue is empty");
            return null;
        }
        else {
                if(front==rear)
                {
                    temp=front;
                    front=null;
                    rear=null;
                    return temp;
                }else {
                    temp=front;
                    front=front.next;
                    return temp;
                }

        }

    }
    public int count()
    {   int count = 0;
        Node temp=front;

        while (temp!=null)
        {
           count++;
           temp=temp.next;
        }
        return count;

    }
    public void disPlay()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        else {
            System.out.println(" all  values are in queue : ");
            Node temp=front;
            while (temp!=null)
            {
                System.out.println("key is "+temp.key+","+"Data is"+temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
