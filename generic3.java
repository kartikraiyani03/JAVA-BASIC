import java.util.*;

class gen<T> // Unbound WildCard
{
    T a;
    
    gen(T a)
    {
        this.a = a;
    }

    public T print()
    {
        return a;
    }
}
 
public class generic3
{
    public static void main(String args[])
    {
        gen<Integer> i = new gen<>(4);
        System.out.println(i.print());

        gen<String> s = new gen<>("hey");
        System.out.println(s.print());

        gen<Double> f = new gen<>(4.4);
        System.out.println(f.print());



    }
}