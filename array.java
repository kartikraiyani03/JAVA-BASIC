import java.util.*;

public class array 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[20];

        System.out.println("Enter the Number of Elements :");
        int x = sc.nextInt();
        
        System.out.println("Enter the Elements ");
        
        for (int i = 0; i < x; i++) 
        {
            marks[i] = sc.nextInt();
        }
        
        System.out.println(" ");
        
        for(int j = 0;j < x; j++)
        {
            System.out.print("["+marks[j]+"] ");
        }

        // for(int elements : marks)
        // {
        //     System.out.println(elements);
        // }
        
        // String arr[] = new String[20];
        // System.out.println("Enter the Number of Character :");
        // String c = sc.next();

        // System.out.println("Enter the Character :");

        // for(int i = 0;i <= c.length();i++)
        // {
        //     arr[i] = sc.nextLine();
        // }

        // for(int j = 0;j <= c.length();j++)
        // {
        //     System.out.print(c.charAt(j));
        // }

        // for (int j = 0; j < 5; j++) 
        // {
        //     // System.out.println(marks[j]);
        //     if(x == marks[j])
        //     {
        //         System.out.println("Value Found " +x+ " at index " +j );
        //     }
        // }
        //     System.out.println("Value not found");

    }
}