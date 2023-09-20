import java.util.*;
 
public class array3
{
    public static void main(String args[])
    {
        // int arr[] = {1,2,3,4,5,6};
        // for(int ele:arr)
        // {
        //     // System.out.println(ele);
        // }

        int a[][] = new int[4][4];
        int k = 0;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                a[i][j] = k;
                k++;
            }
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}