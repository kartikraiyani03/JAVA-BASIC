import java.util.*;
 
public class string
{
    public static void revString(String str,int index)
    {
        if(index == 0)
        {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revString(str,index-1);
    }
    public static void main(String args[])
    {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String str = sc.nextLine();
      revString(str,str.length()-1);

    }
}