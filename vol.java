import java.util.*;

class circle
{
    int r;

    circle()
    {
        System.out.println("Default ");
    }

    circle(int r)
    {
        System.out.println("Parameter");
        this.r = r;
    }

    public double area()
    {
        return (3.14*r*r);
    }
}

class cylinder extends circle
{
    int h;
    
    cylinder(int r,int h)
    {
        super(r);
        System.out.println("Parameter");
        this.h = h;
    }

    public double vol()
    {
        return (3.14*r*r*h);
    }
}
 
public class vol
{
    public static void main(String args[])
    {
        cylinder c = new cylinder(3,4);
        System.out.println(c.vol());

    }
}