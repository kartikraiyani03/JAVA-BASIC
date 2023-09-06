import java.util.*;

class threads extends Thread
{
    public void run()
    {
        System.out.println("Running "+this.getName());
    }
}
 
public class thread10
{
    public static void main(String args[])
    {
        threads t1 = new threads();
        threads t2 = new threads();
        threads t3 = new threads();

        t1.start();
        try
        {
            // t1.join();
            System.out.println(Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
        try
        {
            System.out.println(Thread.currentThread().getName());
            // t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t3.start();
        try
        {
            System.out.println(Thread.currentThread().getName());
            // t3.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}