import java.util.*;
 
public class stack1
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack
    {
        static Node head = null;

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
                int top = head.data;
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
                return head.data;
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
                    System.out.print(peek()+" -> ");
                    pop();
                }
                System.out.print("NULL");
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
        st.pop();
        st.push(5);

        st.print();
    }
}