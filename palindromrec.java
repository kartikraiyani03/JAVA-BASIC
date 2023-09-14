import java.util.*;
 
public class palindromrec  // Not Working
{
    public static boolean palindrom(String str, int n)
    {
        if(str.length() <= 1)
        {
            return true;
        }
        palindrom(str, n+1);
        return false;        
    }

    public static void main(String args[])
    {
        String str = "noon";
        palindrom(str,0);
    }
}

