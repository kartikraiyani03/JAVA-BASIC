import java.util.*;
 
public class StackBottom
{
     public static void pushbottom(int data, Stack<Integer> st)
     {
        if(!st.isEmpty())
        {
            st.push(data);
            return;
        }

        int arr = st.pop();
        pushBottom(data,st);
        st.push(arr);
     }
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<Integer>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.pushbottom(29,st);

        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }

    }
}