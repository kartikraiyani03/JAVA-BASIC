import java.util.*;
 
public class array4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[][][] = new int[3][3][3];

        System.out.println("Enter the Number : ");
     for (int i = 0; i < 2; i++) 
     {
        for(int j = 0; j < 2; j++)
        {
            for(int k = 0; k < 2; k++)
            {
                arr[i][j][k] = sc.nextInt();
            }
        }
     }

     System.out.println();
     for (int i = 0; i < 2; i++) 
     {
        for(int j = 0; j < 2; j++)
        {
            for(int k = 0; k < 2; k++)
            {
                System.out.print(arr[i][j][k]+ " ");
            }
            System.out.println();
        }
        System.out.println();
     }

    }
}