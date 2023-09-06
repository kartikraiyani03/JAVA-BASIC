import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class threadpool extends Thread
{
    public void run()
    {
        System.out.println("Running "+this.getName());
    }
}
 
public class thread8
{
    public static void main(String args[])
    {
        ExecutorService e = new Executors.newFixedThreadPool(3);
        
        threadpool t1 = new threadpool();
        threadpool t2 = new threadpool();
        threadpool t3 = new threadpool();


        e.execute(t1);
        e.execute(t2);
        e.execute(t3);

        e.shutdown();
    }
}
