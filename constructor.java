import java.util.*;

class Student
{
    String name;
    float cgpa;
    int marks;

     Student(String n,float c, int m)
     {
        this.name = n;
        this.cgpa = c;
        this.marks = m;
     }
     Student(Student s1)
     {
        this.name = s1.name;
        this.cgpa = s1.cgpa;
        this.marks = s1.marks;
     }

     void display()
     {
        System.out.println(this.name);
        System.out.println(this.cgpa);
        System.out.println(this.marks);
        System.out.println();
     }

}
 
public class constructor
{
    public static void main(String args[])
    {
        Student s1 = new Student("Alpha",9.13f,90);
        Student s2 = new Student(s1);
        Student s3 = new Student(s1);

      //   s1.name = "Betta";

        s1.display();
        s2.display();
        s3.display();

        
    }
}