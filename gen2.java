import java.util.*;

class generic2
{
    Object a;

    generic2(Object a)
    {
        this.a = a;
    }

    public Object print()
    {
        return a;
    }
}

public class gen2
{
    public static void main(String args[])
    {
        generic2 g1 = new generic2(2);
        int i = (Integer) g1.print();
        System.out.println(i);

        generic2 g2 = new generic2("String");
        String s = (String) g2.print();
        System.out.println(s);

    }
}
