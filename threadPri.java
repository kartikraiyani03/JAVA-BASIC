import java.util.*;

class thread extends Thread
{
    public thread(String name)
    {
        super(name);
    }

    public void runner()
    {
        System.out.println("The Name is "+this.getName());
    }
}
 
public class threadPri
{
    public static void main(String args[])
    {
        thread t1 = new thread("Alpha");
        thread t2 = new thread("Beta");
        thread t3= new thread("Gamma");
        thread t4 = new thread("Theta");

        t1.start();

    }
}