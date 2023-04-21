import java.util.*;
 
public class function
{   

    public static int sum(int a , int b)
    {
      return a+b;
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println(("Enter the Twi Nummbers"));
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println( sum(a,b));
    }
}