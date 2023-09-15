import java.util.*;

 class car
 {
    String name;
    String color;

    public void print()
    {
        System.out.println("Name of the Car is "+this.name);
        System.out.println("Color of the Car is "+this.color);
    }
 }
 
public class oops
{
    public static void main(String args[])
    {
        car car1 = new car();
        car car2 = new car();
        car car3 = new car();

        car1.name = "Rolls Royce Ghost";
        car2.name = "Supra";
        car3.name = "GTR";

        car1.color = "Black";
        car1.color = "Yellow";
        car1.color = "Black";

        car1.print();
        car2.print();
        car3.print();
    }
}