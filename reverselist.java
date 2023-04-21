import java.util.*;
 
public class reverselist
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
        
    public void print()
    {
        Node p = head;
        Node q = head.next;
        Node r = q.next;

        if(head == null || head.next == null)
        {
            return;
        }

        while(q != null)
        {
            q.next = p;

            p = q;
            q = r;
        }

        head.next = null;
        head = p;
    }

    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        System.out.println(list);

    }
}