import java.util.*;
 
public class command
{
    public static void main(String args[])
    {
        String str = args[0];
        int count = 0;

        for(char i : str.toCharArray())
        {
            System.out.println("Character "+i+" Count "+count);
            count++;

        }

        System.out.println(count);
    }
}