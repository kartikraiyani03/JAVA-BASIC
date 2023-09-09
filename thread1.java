import java.util.*;

class thread01 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread01 is Running");
    }
}

class thread02 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread02 is Running");
    }
}

public class thread1 
{
    public static void main(String args[])
    {
        thread01 t1 = new thread01();
        thread02 t2 = new thread02();

        t1.start();
        t2.start();
    }
}