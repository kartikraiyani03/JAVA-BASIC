import java.util.*;
 
public class stringmethods
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

     String str = "Hello This is Root User";

    //  System.out.println(str.length());
    //  System.out.println(str.charAt(3));
    //  System.out.println(str.indexOf('T'));
    //  System.out.println(str.toLowerCase());
    //  System.out.println(str.toUpperCase());
    // System.out.println(str.substring(0,5));
    //  System.out.println(str.substring(6));

    // System.out.println(str.startsWith("Hel"));
    // System.out.println(str.endsWith("Hel"));
    // System.out.println(str.indexOf('i'));

    for(int i = str.length(); i >= 0; i--)
    {
        System.out.print(str.charAt(i));
    }


    }
}