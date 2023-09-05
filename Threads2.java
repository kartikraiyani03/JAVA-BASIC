import java.util.*;

class MyThread1 extends Thread
{
    public static void Run()
    {
        System.out.println("Speaking....");
    }
}

class  MyThread2 extends Thread
{
    public static void Run()
    {
        System.out.println("Listning.....");
    }
}
 
public class Threads2
{
    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}