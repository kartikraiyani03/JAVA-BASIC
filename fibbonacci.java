import java.util.*;
 
public class fibbonacci
{
    public static void fibbo(int n,int a,int b)
    {
        int c;
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
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        System.out.print(a+", ");
        System.out.print(b+", ");
        fibbo(n-2,a,b);

    }
}

