import java.util.*;

public class loop {

  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    // for (int i = 0; i <= 5; i++) 
    // {
    //   System.out.println(i);
    // }

    // System.out.println(" ");
    
    // int i =0;
    // while(i <= 5)
    // {
    //   System.out.println(i);
    //   i++;
    // }
    
    // System.out.println(" ");

    // int j = 0;

    // do
    // {
    //   System.out.println(j);
    //   j++;

    // }while(j <= 5);

    System.out.println("Enter the Number ");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) 
    {
      System.out.print("["+i+"] ");
    }

  }
}