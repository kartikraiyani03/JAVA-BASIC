import java.util.*;

class newthread extends Thread
{
    newthread(String name)
    {
        super(name);
    }

    public void run()
    {
        // while(true)
        // {
        //     try
        //     {
        //         Thread.sleep(300);
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }
        //     System.out.println("Running "+this.getName());
        // }
    }
}
class oldthread extends Thread
{
    oldthread(String name)
    {
        super(name);
    }

    public void run()
    {
        // while(true)
        // {
        //     try
        //     {
        //         Thread.sleep(300);
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }
        //     System.out.println("Running "+this.getName());
        // }
    }
}
 
public class thread6
{
    public static void main(String args[])
    {
        newthread nt = new newthread("01");
        oldthread ot = new oldthread("02");
        
        System.out.println(nt.getState());
        nt.start();
        System.out.println(nt.getState());
        ot.start();
    }
}