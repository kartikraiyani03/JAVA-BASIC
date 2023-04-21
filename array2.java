import java.util.*;
 
public class array2
{
    public static void main(String args[])
    {
        Scanner arr = new Scanner(System.in);
        // int size = arr.getInt();
        int marks[][] = new int[10][10];

        System.out.println("Enter the Number");

        for(int i =0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                marks[i][j] = arr.nextInt();
            }
        }

        System.out.println(" ");
        
        for(int i = 0;i < 4; i++)
        {
            for(int j = 0;j < 4; j++)
            {
                System.out.print("["+marks[i][j]+"] ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}