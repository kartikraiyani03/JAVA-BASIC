import java.util.*;
 
public class sort
{
    public static int check(int arr[],int index)
    {
        if(index == arr.length-1 )
        {
            return 1;
        }

        if(arr[index] < arr[index+1])
        {
            return check(arr,index+1);
        }

        else
        {
            return 0;
        }

    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       
       int arr[] = {9,2,3,4,5,6};

       System.out.println(check(arr,0));

    }
}