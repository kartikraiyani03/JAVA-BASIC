import java.util.*;
 
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        // int sum = 0;
        // int i =0;

        // while(i <= n)
        // {
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println(sum);

        for(int i = 1;i <= 10;i++)
        {
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println(" ");
        }
    }
}