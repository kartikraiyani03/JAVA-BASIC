import java.util.*;

class cylinder
{
    private int h;
    private int r;

    public void setH(int h)
    {
        this.h = h;
    }
    public void setR(int r)
    {
        this.r = r;
    }
    public int getH()
    {
        return this.h;
    }
    public int getR()
    {
        return this.r;
    }
    public double vol()
    {
        return 3.14 * r * r * h;
    }

    // cylinder(int h, int r)
    // {
    //     this.h = h;
    //     this.r = r;
    // }
}

public class volume
{
    public static void main(String args[])
    {
        cylinder c = new cylinder();
        c.setH(5);
        c.setR(5);
        System.out.println(c.vol());
    
    }
}