import java.util.*;

class MyThr extends Thread
{
    MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Running "+this.getName());
    }
}
 
public class thread4
{
    public static void main(String args[])
    {
        MyThr t1 = new MyThr("T1");
        MyThr t2 = new MyThr("T2");
        MyThr t3 = new MyThr("T3");
        MyThr t4 = new MyThr("T4");
        MyThr t5 = new MyThr("T5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}