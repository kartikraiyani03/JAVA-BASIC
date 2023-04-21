import java.util.*;

public class pattern
{

    public static void pattern1(int n)
    {
        if(n > 0)
        {
            pattern1(n-1);

            for(int i =0; i < n;i++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        pattern1(5);
        // for(int i=1;i<=6;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println("");

        // }

        // for(int i = 1;i <= 6;i++)
        // {
        //     for(int j = 6; j >=i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

    }
}