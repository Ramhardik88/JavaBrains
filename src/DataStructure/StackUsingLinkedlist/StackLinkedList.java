package DataStructure.StackUsingLinkedlist;

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        top=null;
    }

    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        else
          return false;
    }
}
