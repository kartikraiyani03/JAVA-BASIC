import java.util.*;
 
public class varags
{

    public static int sum(int ...arr)
    {
        int sum=0;

        for(int ele:arr)
        {
            sum = sum + ele ;
        }
         return sum;
    }

    public static void main(String args[])
    {  
       
       System.out.println(sum(1,2));
       System.out.println(sum(1,2,3));
       System.out.println(sum(1,2,3,4));
       System.out.println(sum(1,2,3,4,5));
       
    }  
}