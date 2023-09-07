import java.util.*;

class Thr1 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i <= 100)
        {
            System.out.print(i);
            i++;
        }
        System.out.println();
    }
} 
class Thr2 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i <= 100)
        {
            System.out.print("a");
            i++;
        }
        System.out.println();
    }
} 
class Thr3 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i <= 100)
        {
            System.out.print("b");
            i++;
        }
        System.out.println();
    }
} 
 
public class thread7
{
    public static void main(String args[])
    {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        Thr3 t3 = new Thr3();

        t1.start();
        t2.start();
        t3.start();

    }
}