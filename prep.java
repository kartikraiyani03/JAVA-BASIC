import java.math.BigInteger;
import java.util.*;

public class prep 
{
    public static BigInteger factorial(long n) 
    {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
        {
            result = result.multiply(new BigInteger(i + ""));
        }

        return result;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Factorial of "+n);
        System.out.println();
        System.out.println(factorial(n));
    }
}