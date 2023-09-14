import java.util.*;
 
public class power
{
    public static int pow(int x,int n)
    {
        if(x == 0)
        {
            return 0;
        }

        if(n == 0)
        {
            return 1;
        }

        int a = pow(x,n-1);
        
        return x*a;
    }
    public static void main(String args[])
    {
        int x;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base");
        x = sc.nextInt();

        System.out.println("Enter the Power");
        n = sc.nextInt();

        System.out.println("Answer is....");
        System.out.println(pow(x,n));

    }
}