import java.util.*;

class Box
{
    double width;
    double height;
    double depth;

    Box()
    {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double w, double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box b)
    {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    public void display()
    {
        System.out.println(this.width);
        System.out.println(this.height);
        System.out.println(this.depth);
    }
}
 
public class object
{
    public static void main(String args[])
    {
        Box b1 = new Box(3,4,5);
        Box b2 = new Box(b1);

        b1.display();
        b2.display();

    }
}