import java.util.*;

class base
{
    int x;

    public void setx(int x)
    {
        this.x = x;
    }
    public int getx()
    {
        return x;
    }
    
}

class derived extends base
{
    int y;

    public void sety(int y)
    {
        this.y = y;
    }
    public int gety()
    {
        return y;
    }

}
 
public class inherit
{
    public static void main(String args[])
    {
        // base b = new base();
        // b.setx(4);
        // System.out.println(b.getx());

        derived d = new derived();
        d.sety(5);
        // System.out.println(d.gety());
        d.setx(2);

        System.out.println(d.getx());
        System.out.println(d.gety());


    }
}