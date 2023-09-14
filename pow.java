import java.util.*;
 
public class pow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base : \n");
        int x = sc.nextInt();
        System.out.println("Enter the Power : \n");
        int n = sc.nextInt();

        System.out.println(Math.pow(x,n));

    }
}