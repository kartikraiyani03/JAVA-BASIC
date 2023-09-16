import java.util.*;
 
public class generics
{
    public static <E extends Comparable> void sort(E[] arr)
    {
        E min;
        int index;

        for(int i = 0; i <= arr.length-1; i++)
        {
            min = arr[i];
            index = i;

            for(int j = i+1; j <= arr.length; j++)
            {
                if(min.compareTo(arr[j]) > 0)
                {
                    min = arr[i];
                    index = j;
                }
            }

            if (index != i) 
            {
              arr[index] = arr[i];
              arr[i] = min;
            }
        }
    }

    public static void main(String args[])
    {


    }
}