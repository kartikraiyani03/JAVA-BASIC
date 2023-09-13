import java.util.*;
 
public class prime
{
    public static void main(String args[])
    {
        int flag = 1;
        int n = 20;

        for(int j = 2; j < n; j++)
        {  
            for(int i = 2; i < n; i++)
            {
                if(n % i == 0)
                {
                    flag = 0;
                    break;
                }
            }

            if(flag == 1)
            {
                System.out.println(j);
            }
        }
    }
}