import java.util.*;

class Bound<T extends Number> // Bound WildCard
{
    T a;

    Bound(T a)
    {
        this.a = a;
    }

    public void print()
    {
        System.out.println(a.getClass().getName());
    }
}
 
public class generic4
{
    public static void main(String args[])
    {
        Bound<Integer> i = new Bound<>(4);
        i.print();

    }
}