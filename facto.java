import java.util.*;
 
public class facto
{
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}

// import java.util.*;

// public class facto 
// {
//     public static void factorial(int n) 
//     {
//         int fact = 1;

//         for (int i = 1 ;i <= n; i++) 
//         {
//             fact = fact * i;
//         }
//       System.out.println(fact);
//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number ");
//         int n = sc.nextInt();
//         factorial(n);

//     }
// }

// import java.util.*;
 
// public class facto
// {
//     public static int factorial(int n)
//     {
//         if(n == 0 || n == 1)
//         {
//             return 1;
//         }
//         else
//         {
//             return n*factorial(n-1);
//         }
//     }
    
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number");
//         int n = sc.nextInt();

//         System.out.println(factorial(n));

//     }
// }