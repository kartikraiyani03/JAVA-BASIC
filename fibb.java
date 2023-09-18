import java.util.*;
 
public class fibb
{
    public static void fibbo(long n,long a,long b)
    {
        long c;

        if(n == 0)
        {
            return;
        }

        c = a + b;
        
        System.out.print(c+", ");
        fibbo(n-1,b,c);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0;
        long b = 1;

        System.out.print(a+", ");
        System.out.print(b+", ");
        
        fibbo(n-2,a,b);
    }
}