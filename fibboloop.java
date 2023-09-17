import java.util.*;
 
public class fibboloop
{

    public static int fibbo(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            int a = 0;
            int b = 1;
            int c = 0;
            for(int i = 2; i <= n; i++)
            {
                c = a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }

    public static void main(String args[])
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.print(fibbo(i)+", ");
        }

    }
}