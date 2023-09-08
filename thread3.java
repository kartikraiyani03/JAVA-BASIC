import java.util.*;

class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Thread 01 is Running");
    }
}
 
public class thread3
{
    public static void main(String args[])
    {
        MyThread t = new MyThread("T1");
        System.out.println(t.getId());
        System.out.println(t.getName());

    }
}