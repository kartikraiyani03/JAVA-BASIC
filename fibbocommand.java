import java.util.*;
 
public class fibbocommand
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
            return fibbo(n-1)+fibbo(n-2);
        }  
    }

    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);

        for(int i = 0; i <= n; i++)
        {
            System.out.println(fibbo(i)+", ");
        }

    }
}