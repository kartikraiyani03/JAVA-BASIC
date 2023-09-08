import java.util.*;

class MYthread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 1 is here");
        }
    }
}

class MYthread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 2 is here");
        }
    }
}
 
public class thread2
{
    public static void main(String args[])
    {
        MYthread1 t1 = new MYthread1();
        Thread th1 = new Thread(t1);

        MYthread2 t2 = new MYthread2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

    }
}