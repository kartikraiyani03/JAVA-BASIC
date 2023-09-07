import java.util.*;

class thr extends Thread
{
    thr(String name)
    {
        super(name);
    }

    public void run()
    {
        while(true)
        {
            System.out.println("Running"+this.getName());
        }
    }
}
 
public class thread5
{
    public static void main(String args[])
    {
        thr t1 = new thr("T1");
        thr t2 = new thr("T2");

        t1.start();
        try
        {
         Thread.sleep(4450);
          t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}