import java.util.*;
 
public class date
{
    public static void main(String args[])
    {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getSeconds());
        System.out.println(d.getHours());

    }
}