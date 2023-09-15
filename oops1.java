import java.util.*;

 class Student
 {
    String name;
    int marks;
    int age;

    public void print()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Marks :"+this.marks);
        System.out.println("Age : "+this.age);
        System.out.println("");
    }

    Student(String name,int marks,int age)
    {
        this.name = name;
        this.marks =  marks;
        this.age = age;
    }
}
 
public class oops1
{
    public static void main(String args[])
    {
        Student s1 = new Student("Alpha",89,20);
        Student s2 = new Student("Beta",90,19);
        Student s3 = new Student("Gamma",91,21);

        s1.print();
        s2.print();
        s3.print();

    }
}
    