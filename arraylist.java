import java.util.*;
 
public class arraylist
{
    public static void main(String args[])
    {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of Elements :");
       int n = sc.nextInt();
       int ele;

       System.out.println("Enter the Elements :");

       for(int i = 0; i < n; i++)
       {
          ele = sc.nextInt();
          arr.add(ele);
       } 

       System.out.println(" ");

       for(int i =0;i < n; i++)
       {
         System.out.print("["+arr.get(i)+"] -> ");
       }

       System.out.println("NULL");
       System.out.println(" ");
    }
}