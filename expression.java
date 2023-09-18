import java.util.*;
 
public class expression
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack
    {
        public static Node head;

        public static boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void push(int data)
        {
            Node ptr = new Node(data);

            if(isEmpty())
            {
                head = ptr;
                return;
            }
            else
            {
                ptr.next = head;
                head = ptr;
            }
        }


    }


    public static void main(String args[])
    {
        String exp;
        Scanner sc = new Scanner(System.in);
        exp = sc.nextLine();



    }
}