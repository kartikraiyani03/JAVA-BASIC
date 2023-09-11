import java.util.*;
 
public class stack
{
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

    static class Stack
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

        public static int pop()
        {
            if(isEmpty())
            {
                return 0;
            }
            else
            {
                int top =head.data;
                head = head.next;
                return top; 
            }
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return 0;
            }
            else
            {
                int top;
                top = head.data;
                return top;
            }
        }

        public static void print()
        {
            if(isEmpty())
            {
                return;
            }
            
            else
            {
                while(!isEmpty())
                {
                    System.out.println(peek());
                    pop();
                }
            }
        }
    }


    public static void main(String args[])
    {
        Stack st = new Stack();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.print();

    }
}