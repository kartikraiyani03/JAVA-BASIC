import java.util.*;
 
public class abstract2
{
    interface SmartPhone
    {
        public void realme5s();
        public void samsunga21s();
        public void samsungm12();
    }

    abstract class Animal
    {       
        public abstract void walk();
        public abstract void eat();    
    }

    abstract class Dog extends Animal
    {
        @Override
        public void walk()
        {
            System.out.println("Walk on 4 legs");
        }

        @Override
        public void eat()
        {
            System.out.println("Not vegan");
        }
    }

    public static void main(String args[])
    {


    }
}