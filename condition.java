import java.util.*;

public class condition
{
    public static void main(String args[])
    {
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter the Age");
      int age = sc.nextInt();
        
        // if-else ladder
        
        if(age > 18)
        {
            System.out.println("You Can drive");
        }
        else
        {
            System.out.println("You Can not drive");
        }
         System.out.println("Enter the number");
        int num = sc.nextInt();
        
        // even and odd  number

        if(num % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
          
        // Greater between two numbers

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a ==b)
        {
            System.out.println("Numbers are equal");
        }
        else if(a>b)
        {
            System.out.println("A is greater than B");
        }
        else
            System.out.println("A is less than B");
        {

        }

    }
}