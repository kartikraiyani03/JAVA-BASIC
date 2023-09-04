import java.util.*;
 
public class varag
{
    public static void vara(int arr[])
    {
        System.out.println("Lenght is "+arr.length);
        System.out.println("All Elements are");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }

    public static void main(String args[])
    {
        vara(1,2,4,4,5,3,5,5,3,2);

    }
}