import java.util.*;

class mythread extends Thread
{
    public void run()
    {
        int i;
        int b = 2;
        System.out.println("Running "+this.getName());
        for(i = 0; i < 5; i++)
        {
            try
            {
                // int c = b / i;
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
 
public class thread9
{
    public static void main(String args[])
    {
        mythread t1 = new mythread();
        t1.start();

    }
}