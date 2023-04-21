import java.util.*;

class GrandParents
{
    // int x;

    GrandParents()
    {
        System.out.println("GrandeParents Contructer :");
    }

    GrandParents(int x)
    {
        System.out.println("Parents Oveloaded Constructer with value x is "+x);
    }

}
class Parents extends GrandParents
{
    // int x;

    Parents()
    {
        System.out.println("Parents Constructer:");
    }

    Parents(int x,int y)
    {
        super(x);
        System.out.println("Parents Oveloaded Constructer with value y is "+y);
    }

}
class Children extends Parents
{
    // int z;

    Children()
    {
        System.out.println("Children Constructer :");
    }

    Children(int x, int y, int z)
    {
        super(x,y);
        System.out.println("Parents Oveloaded Constructer with value z is "+z);
    }

}

public class ConInInheritence
{
    public static void main(String args[])
    {
        Children c = new Children(4,5,6);
        Parents p = new Parents(4,5);
        GrandParents gp = new GrandParents(4);

        System.out.println("");
        System.out.println("*************");
        System.out.println("");
        
        Children c1 = new Children();
        System.out.println("");
        Parents p1 = new Parents();
        System.out.println("");
        GrandParents gp1 = new GrandParents();


    }
}