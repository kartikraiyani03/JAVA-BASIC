import java.util.*;
 
public class palindrom
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;

        while(n>0)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.print(rev);
        
        System.out.println("");

        if(n == rev)
        {
            System.out.println("Pelindrom");
        }
        else
        {
            System.out.println("Not Pelindrom");
        }
    }    
}
