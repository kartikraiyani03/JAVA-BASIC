import java.util.*;
 
public class prep2
{

    public static void Exe(int a, int b) throws ArithmeticException
    {
        int c;
        c = a / b;
         
        System.out.println("No exception");
        if(b == 0)
        {
            throw new ArithmeticException("Caught");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Exe(4,0);

        try
        {
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}