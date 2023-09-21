import java.util.*;

abstract class Parent
{
    abstract void display();
    void info()
    {
        System.out.println("Parent Class");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Child Class");
    }
}
 
public class Abstract
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.info();
        c.display();

    }
}