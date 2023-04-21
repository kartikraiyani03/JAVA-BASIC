import java.util.*;

class thread
{
    public void work()
    {
        System.out.println("Multiple Processes Are Running Simulteneously");
    }
}
class thread1 extends thread
{
    public void work()
    {
        // while(true)
        // {
            System.out.println("Listining.....");
        // }
    }
}

class thread2 extends thread
{
    public void work()
    {
        System.out.println("Speaking.....");
    }
}
 
public class Threads
{
    public static void main(String args[])
    {
        thread t1 = new thread1();
        thread t2 = new thread2();

        t1.work();
        t2.work();
    }
}