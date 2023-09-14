import java.util.*;
 
public class permutation
{
    public static void permu(String str, String perm, int index)
    {
        if(str.length() ==0)
        {
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char alpha = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            permu(newstr,perm+alpha,index+1);
        }
    }
    public static void main(String args[])
    {
        String str = "ABC";
        permu(str,"",0);

    }
}