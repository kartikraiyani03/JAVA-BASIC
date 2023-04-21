import java.util.*;
 
public class reverseStack
{
    public static void pushbottom(int data, Stack<Integer> st)
    {
       if(!st.isEmpty())
       {
           st.push(data);
           return;
       }

       int arr = st.pop();
       st.pushBottom(data);
       st.push(arr);
    }

    public static void reverse(Stack<Integer> st)
    {
        int top = st.pop();
        reverse(st);
        pushBottom(top,st);

    }
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);

        while(!st.isEmpty()) 
        {
            System.out.println(st.peek());
            st.pop();
        }

    }
}